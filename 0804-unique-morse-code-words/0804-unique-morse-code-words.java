class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    String[] morse = {
    ".-", "-...", "-.-.", "-..", ".", "..-.",
    "--.", "....", "..", ".---", "-.-", ".-..",
    "--", "-.", "---", ".--.", "--.-", ".-.",
    "...", "-", "..-", "...-", ".--", "-..-",
    "-.--", "--.."
    };
    HashSet<String> set=new HashSet<>();
    for(int i=0;i<words.length;i++){
        String str=words[i];
        String ms="";
        for(char ch:str.toCharArray()){
            ms+=morse[ch-'a'];
        }
        set.add(ms);
    }
    return set.size();
    }
}