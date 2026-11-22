class Solution {
    public String compressedString(String str) {
        String ans="";
        int i=0;
        while(i<str.length()){
            int cnt=1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1) && cnt<9){
                cnt++;
                i++;
            }
            ans=ans+String.valueOf(cnt)+str.charAt(i);
            i++;
        }
        return ans;
    }
}