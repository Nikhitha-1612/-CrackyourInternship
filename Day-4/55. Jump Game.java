class Solution {
    public boolean canJump(int[] nums) {
        int getgoodposition=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
           if(nums[i]+i>=getgoodposition){
               getgoodposition=i;
           } 
        }
        return getgoodposition == 0;
    }
}
