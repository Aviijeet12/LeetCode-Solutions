class Solution {
    int mw;
    public String findLine(int i, int j, int spacebetween, int extraspace, String[] words){
        StringBuilder sb = new StringBuilder();

        for(int k=i;k<j;k++){
            sb.append(words[k]);
            if(k==j-1){
                continue;
            }
            for(int z=1;z<=spacebetween;z++){
                sb.append(" ");
            }
            if(extraspace>0){
                sb.append(" ");
                extraspace--;
            }

        }
        while(sb.length()<mw){
            sb.append(" ");
        }
        return sb.toString();
    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        mw = maxWidth;
        int n = words.length;
        List<String> res = new ArrayList<>();
        int i = 0;

        while(i<n){
            int lettercount = words[i].length();
            int j = i+1;
            int space = 0;

            while(j<n && space + words[j].length()+1 + lettercount <= mw){
                lettercount += words[j].length();
                space += 1;
                j++;
            }
            int remspaces = mw - lettercount;
            int spacebetween = space==0? 0: remspaces/space;
            int extraspace = space==0? 0: remspaces%space;

            if(j==n){
                spacebetween = 1;
                extraspace = 0;
            }
            res.add(findLine(i,j,spacebetween,extraspace,words));
            i=j;
        }

        return res;
    }
}