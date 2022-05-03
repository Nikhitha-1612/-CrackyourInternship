class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=0;
        int count=0;
       if(nums.length<2){
           return nums.length;
       }
        while(i<nums.length){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
            i++;
        }
        return j+1;
    }
}
