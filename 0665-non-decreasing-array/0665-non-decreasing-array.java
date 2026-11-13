class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        boolean flag = false;

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]&&!flag){
                flag = true;
                if (i>0 && nums[i-1] > nums[i+1]){
                    nums[i+1] = nums[i];
                } else {
                    nums[i] = nums[i+1];
                }
            }else if(nums[i]>nums[i+1]&&flag){
                return false;
            }
        }
        return true;
    }
}