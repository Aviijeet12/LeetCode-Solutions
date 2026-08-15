class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int res = 0;
        boolean zero = true;

        for(int i : nums){
            res = (res^i);
            if(i!=0){
                zero = false;
            }
        }
        if(zero){
            return 0;
        }
        return (res==0)?n-1:n;
    }
}