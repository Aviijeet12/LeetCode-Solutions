class Solution {
    Integer[] dp;
    public int solve(int i, int n, int[] cost){
        if(i==n){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int cst = Integer.MAX_VALUE;
        int j = i+1;
        if(j<=n){
            cst = solve(j,n,cost)+cost[j-1]+(j-i)*(j-i);
        }
        j = i+2;
        if(j<=n){
            cst = Math.min(cst,solve(j,n,cost)+cost[j-1]+(j-i)*(j-i));
        }
        j = i+3;
        if(j<=n){
            cst = Math.min(cst,solve(j,n,cost)+cost[j-1]+(j-i)*(j-i));
        }
        return dp[i] = cst;
    }
    public int climbStairs(int n, int[] costs) {
        dp = new Integer[n+1];
        return solve(0,n,costs);
    }
}