class Solution {
    public int strStr(String haystack, String needle) {
        char ch=needle.charAt(0);
        int i=0;
        int n=haystack.length()-needle.length()+1;
        while(i<n){
            if(haystack.charAt(i)==ch){
                String str=haystack.substring(i,i+needle.length());
                if(str.equals(needle)){return i;}
            }
            i++;
        }
        return -1;
    }
}