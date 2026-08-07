class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]<=nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[i-1]){
                    return false;
                }
            }
            return true;
        }else{
            for(int i=nums.length-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
            return true;
        }
    }
}