class Solution {
    public int longestContinuousSubstring(String s) {
        int i=0;
        int j=1;
        int ans=1;
        int cnt=1;
        while(i<s.length() && j<s.length()){
            if(s.charAt(j)-s.charAt(i)==1){
                cnt++;
                ans=Math.max(ans,cnt);
                i++;
                j++;
            }
            else{
                cnt=1;
                i++;
                j++;
            }
        }
        return ans;
    }
}