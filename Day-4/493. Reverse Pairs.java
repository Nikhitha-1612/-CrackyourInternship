class Solution {
    public int reversePairs(int[] nums) {
         return mergeSort(nums,0,nums.length-1);
    }
    
    private int mergeSort(int[] arr, int s, int e){
        if(s>=e){
            return 0;
        }
        int m = s + (e-s)/2;
        int count = mergeSort(arr,s,m) + mergeSort(arr,m+1,e);
        count += merge(arr,s,m,e);
        return count;
    }
    private int merge(int[] arr, int s, int m, int e){
        int count = 0;
        int j = m+1;
        List<Integer> res = new ArrayList<>();
        for(int i = s; i<=m; i++){
            while(j <= e && arr[i] > (2*(long)arr[j])){
                j++;
            }
            count += (j-(m+1));
        }
        int left = s;
        int right = m+1;
        while(left<=m && right<=e){
            if(arr[left]<=arr[right]){
                res.add(arr[left++]);
            }else{
                res.add(arr[right++]);
            }
        }
        while(left<=m){
            res.add(arr[left++]);
        }
        while(right<=e){
            res.add(arr[right++]);
        }
        for(int l = s; l<=e; l++){
            arr[l] = res.get(l-s);
        }
        return count;
    }
}
