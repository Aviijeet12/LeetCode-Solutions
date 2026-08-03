class Solution {
    int N;
    Integer[] dp;
    public int solve(int[] nums, int i){
        if(i>=N){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int take1 = nums[i] - solve(nums,i+1);
        int take2 = Integer.MIN_VALUE;
        if(i+1<N){
            take2 = nums[i]+nums[i+1] - solve(nums,i+2);
        }
        int take3 = Integer.MIN_VALUE;
        if(i+2<N){
            take3 = nums[i] + nums[i+1] + nums[i+2] - solve(nums,i+3);
        }

        return dp[i] = Math.max(take1,Math.max(take2,take3));
    }
    public String stoneGameIII(int[] stoneValue) {
        N = stoneValue.length;
        dp = new Integer[N+1];
        int dif = solve(stoneValue,0);
        if(dif>0){
            return "Alice";
        }else if(dif<0){
            return "Bob";
        }else{
            //System.out.println("Tie");
            return "Tie";
        }
    }
}