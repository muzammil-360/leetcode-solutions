class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash={-1,-1,-1};
        int cnt=0;
        int i=0;
        while(i<s.length()){
            hash[s.charAt(i)-'a']=i;
            if(hash[0]!=-1 && hash[0]!=-1 && hash[0]!=-1){
                cnt+=(1+Math.min(hash[0],Math.min(hash[1],hash[2])));
            }
            i++;
        }
        return cnt;
    }
}