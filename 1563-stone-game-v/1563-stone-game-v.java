class Solution {
    Integer[][] dp;
    public int solve(int l, int r, int[] pre){
        if(l>=r){
            return 0;
        }
        if(dp[l][r]!=null){
            return dp[l][r];
        }
        int score = 0;
        for(int mid = l;mid<r;mid++){
            int ls = pre[mid] - (l-1>=0?pre[l-1]:0);
            int rs = pre[r] - pre[mid];
            if(ls<rs){
                score = Math.max(score,ls+solve(l,mid,pre));
            }else if(ls>rs){
                score = Math.max(score,rs+solve(mid+1,r,pre));
            }else{
                score = Math.max(score,Math.max(ls+solve(l,mid,pre),rs+solve(mid+1,r,pre)));
            }
        }
        return dp[l][r] = score;
    }
    public int stoneGameV(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        dp = new Integer[n+1][n+1];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+nums[i];
        }
        return solve(0,n-1,pre);
    }
}