class Solution {
    public boolean isRobotBounded(String s) {
        int x = 0;
        int y = 0;
        int n = s.length();
        String dir = "north";

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='G'&&dir=="north"){
                y++;
            }else if(c=='G'&&dir=="left"){
                x--;
            }else if(c=='G'&&dir=="right"){
                x++;
            }else if(c=='G'&&dir=="south"){
                y--;
            }

            if(dir=="north"){
                if(c=='L'){
                    dir = "left";
                    continue;
                }else if(c=='R'){
                    dir = "right";
                    continue;
                }
            }else if(dir=="left"){
                if(c=='L'){
                    dir = "south";
                    continue;
                }else if(c=='R'){
                    dir = "north";
                    continue;
                }
            }else if(dir=="right"){
                if(c=='L'){
                    dir = "north";
                    continue;
                }else if(c=='R'){
                    dir = "south";
                    continue;
                }
            }else{
                if(c=='L'){
                    dir = "right";
                    continue;
                }else if(c=='R'){
                    dir = "left";
                    continue;

                }
            }
        }


        if(x==0&&y==0){
            return true;
        }
        if(dir=="north"){
            return false;
        }
        return true;
    }
}