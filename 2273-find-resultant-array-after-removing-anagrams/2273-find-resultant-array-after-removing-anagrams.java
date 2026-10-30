class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        int i=0;
        int j=1;
        while(i<words.length && j<words.length){
            if(func(words[i],words[j])){
                j++;
            }
            else{
                ans.add(words[i]);
                i=j;
                j++;
            }
        }
        if(i<words.length){ans.add(words[i]);}
        return ans;
    }
    public boolean func(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
        }
        for(int num:freq){
            if(num!=0){return false;}
        }
        return true;
    }
}