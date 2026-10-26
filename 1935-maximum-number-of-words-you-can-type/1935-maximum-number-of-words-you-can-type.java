class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        HashSet<Character> set=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()){
            set.add(ch);
        }
        int cnt=0;
        for(String word:words){
            String str=word;
            for(char ch:str.toCharArray()){
                if(set.contains(ch)){cnt++;break;}
            }
        }
        return words.length-cnt;
    }
}