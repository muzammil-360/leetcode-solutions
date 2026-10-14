class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            String str=s.substring(i,i+k);
            int ans=0;
            for(int m=0;m<str.length();m++){
                ans+=(str.charAt(m)-'a');
            }
            ans=ans%26;
            sb.append((char)('a'+ans));
            i+=k;
        }
        return sb.toString();
    }
}