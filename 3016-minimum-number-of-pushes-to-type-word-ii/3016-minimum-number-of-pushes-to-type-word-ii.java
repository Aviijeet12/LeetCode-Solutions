class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int[] freq = new int[26];

        for(Character ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        //Arrays.sort(freq,(a,b)=>{freq[b]-freq[a]});
        Arrays.sort(freq);
        int res = 0;
        int cnt = 0;
        for(int i=25;i>=0;i--){
            if(freq[i]>0){
                if(cnt<8){
                    res += freq[i];
                }else if(cnt<16){
                    res += freq[i]*2;
                }else if(cnt<24){
                    res += freq[i]*3;
                }else{
                    res += freq[i]*4;
                }
                cnt++;
            }
        }
        return res;
    }
}