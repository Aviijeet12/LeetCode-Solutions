class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0; int j=0;
        int res = 0;

        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(i<j && map.get(s.charAt(j))>2){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}