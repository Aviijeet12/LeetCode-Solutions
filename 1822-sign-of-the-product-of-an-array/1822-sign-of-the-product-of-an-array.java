class Solution {
    public int arraySign(int[] nums) {
        int negcnt = 0;
        int poscnt = 0;
        for(int i : nums){
            if(i<0){
                negcnt++;
            }else if(i>0){
                poscnt++;
            }else{
                return 0;
            }
        }
        if(negcnt%2==0){
            return 1;
        }else{
            return -1;
        }
    }
}