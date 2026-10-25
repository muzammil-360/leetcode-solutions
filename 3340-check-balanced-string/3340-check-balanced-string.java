class Solution {
    public boolean isBalanced(String s) {
        int i=0;
        int j=1;
        int a=0;
        int b=0;
        while(i<s.length() && j<s.length()){
            a+=s.charAt(i)-'0';
            b+=s.charAt(j)-'0';
            i+=2;
            j+=2;
        }
        if(s.length()%2==1){
            a+=s.charAt(s.length()-1)-'0';
        }
        return a==b;
    }
}