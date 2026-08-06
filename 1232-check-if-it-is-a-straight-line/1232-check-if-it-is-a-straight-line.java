class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2){
            return true;
        }
        int x0 = coordinates[0][0];
        int x1 = coordinates[1][0];
        int y0 = coordinates[0][1];
        int y1 = coordinates[1][1];

        int n = coordinates.length;
        for(int i=2;i<n;i++){
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if((y1-y0)*(x-x0)!=(y-y0)*(x1-x0)){
                return false;
            }    
        }
        return true;
    }
}