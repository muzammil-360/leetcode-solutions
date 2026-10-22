class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s1="";
        for(int i=0;i<words.size();i++){
            String str=words.get(i);
            s1+=str.charAt(0);
        }
        return s.equals(s1);
    }
}