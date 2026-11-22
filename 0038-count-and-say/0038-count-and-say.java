class Solution {
    public String countAndSay(int n) {
        String ans="";
        int temp=1;
        while(temp<=n){
            ans=RLE(ans);
            temp++;
        }
        return ans; 
    }
    public String RLE(String str){
        if(str.length()==0){return "1";}
        String ans="";
        int i=0;
        while(i<str.length()){
            int cnt=1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                cnt++;
                i++;
            }
            ans=ans+String.valueOf(cnt)+str.charAt(i);
            i++;
        }
        return ans;
    }
}