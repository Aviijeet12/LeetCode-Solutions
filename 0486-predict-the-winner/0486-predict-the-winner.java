class Solution {
    int N;
    Integer[][] dp;
    public int solve(int[] nums, int i, int j){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int take_i = nums[i] + Math.min(solve(nums,i+2,j),solve(nums,i+1,j-1));
        int take_j = nums[j] + Math.min(solve(nums,i,j-2),solve(nums,i+1,j-1));

        return dp[i][j] = Math.max(take_i,take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        N = nums.length;
        int total = 0;
        for(int i : nums){
            total += i;
        }
        dp = new Integer[N+1][N+1];
        int p1 = solve(nums,0,N-1);
        int p2 = total-p1;
        if(p1>=p2){
            return true;
        }else{
            return false;
        }
    }
}