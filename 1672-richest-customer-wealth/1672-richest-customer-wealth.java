class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxo = Integer.MIN_VALUE;
        int n = accounts.length;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            maxo = Math.max(maxo,sum);
        }
        return maxo;
    }
}