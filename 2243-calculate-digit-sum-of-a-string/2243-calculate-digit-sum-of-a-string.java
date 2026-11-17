class Solution {
    public String sum(String s){
        
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return Integer.toString(sum);
    }
    public String digitSum(String s, int k) {
        while(s.length()>k){
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while(i<s.length()){
                String si = s.substring(i,Math.min(i+k,s.length()));
                String ans = sum(si);
                sb.append(ans);
                i+=k;
            }
            s = sb.toString();
        }
        return s;
    }
}