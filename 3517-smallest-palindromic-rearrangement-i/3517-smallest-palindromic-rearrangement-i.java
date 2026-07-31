class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] ch = s.substring(0,n/2).toCharArray();
        Arrays.sort(ch);

        String s1 = new String(ch);
        if(n%2==0){
            StringBuilder s2 = new StringBuilder(s1);
            return s1+s2.reverse().toString();
        }else{
            StringBuilder s2 = new StringBuilder(s1);
            return s1+s.charAt(n/2)+s2.reverse().toString();
        }
    }
}