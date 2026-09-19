class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String m=strs[strs.length-1];
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=m.charAt(i))break;
            ans+=s.charAt(i);
        }
        return ans;
    }
}