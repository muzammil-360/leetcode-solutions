class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(check(words[i]) && (i>=left && i<=right)){cnt++;}
        }
        return cnt;
    }
    public boolean check(String s){
        char start=s.charAt(0);
        char end=s.charAt(s.length()-1);
        if((start=='a' || start=='e' || start=='i' || start=='o' || start=='u') &&     (end=='a' || end=='e' || end=='i' ||end=='o' || end=='u')){return true;}
        return false;
    }
}