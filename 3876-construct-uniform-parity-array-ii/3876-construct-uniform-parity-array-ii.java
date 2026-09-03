class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] odd = new int[n];
        int minodd = -1;
        int oddidx = -1;
        boolean ansodd = true;
        for(int i=0;i<n;i++){
            if (nums1[i] % 2 == 1) {
                if (minodd == -1 || nums1[i] < minodd) {
                    minodd = nums1[i];
                    oddidx = i;
                }
            }
        }
        if (minodd == -1) {
            return true;
        }
        //odd array
        if(minodd!=-1){
            for(int i=0;i<n;i++){
                if(nums1[i]%2==1){
                    odd[i] = nums1[i];
                }else{
                    if(nums1[i] - minodd>=1){
                        odd[i] = nums1[i] - minodd;
                    }else{
                        ansodd = false;
                    }
                }
            }
        }
        
        return ansodd;
    }
}