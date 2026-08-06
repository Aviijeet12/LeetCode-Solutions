class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c>=97&&c<=122){
                sb.append(c);
            }else if(c>=65&&c<=90){
                char z = (char)(c+32);
                sb.append(z);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}