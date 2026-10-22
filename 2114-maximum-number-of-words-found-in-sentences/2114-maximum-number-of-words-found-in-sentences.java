class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            int cnt=1;
            for(char ch:str.toCharArray()){
                if(ch==' ')cnt++;
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}