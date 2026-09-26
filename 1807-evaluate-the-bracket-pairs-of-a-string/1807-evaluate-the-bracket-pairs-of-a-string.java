class Solution {
    public String evaluate(String s, List<List<String>> kn) {
        int n = s.length();
        HashMap<String,String> map = new HashMap<>();
        for(List<String> e : kn){
            map.put(e.get(0),e.get(1)); 
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<n){
            if(s.charAt(i)>=97&&s.charAt(i)<=122){
                sb.append(s.charAt(i));
            }else{
                i++;
                StringBuilder temp = new StringBuilder();
                while(s.charAt(i)!=')'&&i<n){
                    temp.append(s.charAt(i));
                    i++;
                }
            String res = map.getOrDefault(temp.toString(),"?");
            sb.append(res);
            }
            i++;
        }
        return sb.toString();
    }
}