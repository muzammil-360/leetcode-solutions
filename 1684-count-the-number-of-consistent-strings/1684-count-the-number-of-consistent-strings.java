class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(String s:words){
            HashSet<Character> set=new HashSet<>();
            for(char ch:allowed.toCharArray()){
                set.add(ch);
            }
            boolean b=true;
            for(char ch:s.toCharArray()){
                if(!set.contains(ch)){b=false;}
            }
            if(b==true){cnt++;}
        }
        return cnt;
    }
}