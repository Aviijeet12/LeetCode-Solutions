class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1;
        int sum = 0;
        int k = n;
        while(n>0){
            int d = n%10;
            prod *= d;
            sum += d;
            n = n/10;
        }
        return k%(prod+sum)==0;
    }
}