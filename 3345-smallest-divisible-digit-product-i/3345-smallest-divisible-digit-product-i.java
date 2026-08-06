class Solution {
    public int digitproduct(int n){
        int res = 1;
        while(n>0){
            int d = n%10;
            res *= d;
            n = n/10;
        }
        return res;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int dp = digitproduct(i);
            if(dp%t==0){
                return i;
            }
        }
        return 0;
    }
}