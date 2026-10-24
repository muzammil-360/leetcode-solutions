class Solution {
    public long appealSum(String s) {
        int[] freq=new int[26];
        long sum=0;
        int i=0;
        while(i<s.length()){
            freq[s.charAt(i)-'a']=i+1;
            for(int x:freq){
                sum+=x;
            }
            i++;
        }
        return  sum;
    }
}