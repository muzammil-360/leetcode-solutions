class Solution {
    public int partitionString(String s) {
        int cnt=0;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        while(i<s.length()){
            if(set.contains(s.charAt(i))){
                cnt++;
                set.clear();
                set.add(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }
            i++;
        }
        return cnt+1;
    }
}