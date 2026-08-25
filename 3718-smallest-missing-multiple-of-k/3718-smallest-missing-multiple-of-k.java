class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int j=1;
        while(true){
            if(!set.contains(j*k)){
                return j*k;
            }
            j++;
        }
        
    }
}