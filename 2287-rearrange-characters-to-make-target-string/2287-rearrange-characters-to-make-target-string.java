class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freq1=new int[26];
        for(char ch:s.toCharArray()){
            freq1[ch-'a']++;
        }
        int[] freq2=new int[26];
        for(char ch:target.toCharArray()){
            freq2[ch-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(char ch:target.toCharArray()){
                min=Math.min(min,freq1[ch-'a']/freq2[ch-'a']);
        }
        return min;
    }
}