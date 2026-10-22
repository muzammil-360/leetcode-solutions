class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            String str=words[i];

            boolean flag=true;

            int[] freq=new int[26];
            for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
            }

            for(char ch:str.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a']<0) flag=false;
            }

            if(flag){
                ans+=str.length();
            }
        }
        return ans;
    }
}