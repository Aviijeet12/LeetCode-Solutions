class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        int flag = 0;

        if(n<=9){
            return false;
        }
        while(n>=k){
            n = n-k;
            k--;
            flag = 1-flag;
        }
        return flag==0?false:true;
    }
}