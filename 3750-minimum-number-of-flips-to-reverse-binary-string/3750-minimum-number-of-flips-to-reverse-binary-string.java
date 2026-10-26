class Solution {
    public int minimumFlips(int n) {
        String s1=Integer.toBinaryString(n);
        String rev=reverse(s1);
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=rev.charAt(i))cnt++;
        }
        return cnt;
    }
    public String reverse(String str){
        char[] s=str.toCharArray();
        int start=0;
        int end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        return new String(s);
    }
}