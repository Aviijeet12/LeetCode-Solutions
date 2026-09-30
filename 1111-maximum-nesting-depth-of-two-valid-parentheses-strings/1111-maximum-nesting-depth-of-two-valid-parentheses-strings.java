class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] arr = new int[n];
        int d = 0;

        for(int i=0;i<n;i++){
            char c = seq.charAt(i);
            if(c=='('){
                d++;
                arr[i] = (d%2==0)?0:1;
            }else{
                arr[i] = (d%2==0)?0:1;
                d--;
            }
        }
        return arr;
    }
}