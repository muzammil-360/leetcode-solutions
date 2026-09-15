class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(char c:word.toCharArray()){
            set.add(c);
        }
        int cnt=0;
        for(char c:set){
            // int num=c-'0';
            // int xor=num^32;

            if(set.contains((char)(c^32))){cnt++;}
        }
        return cnt/2;
    }
}