class Solution {
    public boolean checkString(String s) {
        int lasta = -1;
        int firstb = s.length();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a'){
                lasta = i;
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                firstb = i;
                break;
            }
        }
        if(firstb<lasta){
            return false;
        }
        return true;
    }
}