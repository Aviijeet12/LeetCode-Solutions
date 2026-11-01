class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        for(int i : nums){
            mini = Math.min(i,mini);
        }
        long cnt = 0;
        for(int i : nums){
            int d = i - mini;
            cnt += d;
        }
        return (int)cnt;
    }
}