class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int k = nums[0];
        int m = nums[nums.length-1];
        int j = 0;
        for(int i=k;i<=m;i++){
            if(j<nums.length&&nums[j]==i){
                j++;
            }else{
                res.add(i);
            }
        }
        return res;
    }
}