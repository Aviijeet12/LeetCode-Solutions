class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = nums[0];
        suff[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            pre[i] = Math.max(pre[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            suff[i] = Math.min(suff[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            int d = pre[i] - suff[i];
            if(d<=k){
                return i;
            }
        }
        return -1;
    }
}