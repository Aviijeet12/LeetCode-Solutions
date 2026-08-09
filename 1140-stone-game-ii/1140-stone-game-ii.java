class Solution {
    int N;
    Integer[][][] dp;

    public int solve(int[] piles, int person, int i, int M){
        if(i>=N){
            return 0;
        }
        if(dp[person][i][M]!=null){
            return dp[person][i][M];
        }
        int stones = 0;
        int res = (person==1)?-1:Integer.MAX_VALUE;
        for(int x=1;x<=Math.min(2*M,N-i);x++){
            stones += piles[i+x-1];
            if(person==1){
                res = Math.max(res,stones+solve(piles,0,i+x,Math.max(M,x)));
            }else{
                res = Math.min(res,solve(piles,1,i+x,Math.max(M,x)));
            }
        }
        return dp[person][i][M] = res;
    }
    public int stoneGameII(int[] piles) {
        N = piles.length;
        dp = new Integer[2][101][101];
        return solve(piles,1,0,1);
    }
}