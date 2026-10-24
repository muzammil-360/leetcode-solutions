class Solution {
    public int uniqueLetterString(String s) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        long sum=0;
        int i=0;
        while(i<s.length()){
            freq2[s.charAt(i)-'A']=freq1[s.charAt(i)-'A'];
            freq1[s.charAt(i)-'A']=i+1;
            for(int x=0;x<26;x++){
                sum+=(freq1[x]-freq2[x]);
            }
            i++;
        }
        return  (int)sum;
    }
}