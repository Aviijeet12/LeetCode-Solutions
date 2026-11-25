class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxo = 0;
        for(int i=1;i<n;i++){
            maxo = Math.max(maxo,nums[i]-nums[i-1]);
        }
        return maxo;
    }
}