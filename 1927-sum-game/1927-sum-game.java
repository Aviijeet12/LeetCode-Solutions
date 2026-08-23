class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int lsum = 0;
        int rsum = 0;
        int lqcnt = 0;
        int rqcnt = 0;

        for(int i=0;i<n;i++){
            if(num.charAt(i)=='?'){
                if(i<n/2){
                    lqcnt++;
                }else{
                    rqcnt++;
                }
            }else{
                if(i<n/2){
                    lsum+=num.charAt(i) - '0';
                }else{
                    rsum += num.charAt(i) - '0';
                }
            }
        }
        if((lqcnt+rqcnt)%2==1) return true;
        int left = 2*lsum + 9*lqcnt;
        int right = 2*rsum + 9*rqcnt;
        return left!=right;
    }
}