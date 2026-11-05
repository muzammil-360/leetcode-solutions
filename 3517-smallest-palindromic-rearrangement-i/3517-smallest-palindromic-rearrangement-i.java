class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1)return s;
        int h=s.length()/2;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<h;i++){
            sb.append(s.charAt(i));
        }
        char[] arr=sb.toString().toCharArray();
        Arrays.sort(arr);
        String half= new String(arr);
        String reverse = new StringBuilder(half).reverse().toString();
        if(s.length()%2==1){
            char ch=s.charAt(s.length()/2);
            return half+Character.toString(ch)+reverse;
        }
        return half+reverse;
    }
}