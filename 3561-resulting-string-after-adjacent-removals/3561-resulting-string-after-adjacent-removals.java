class Solution {
    public String resultingString(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && ( Math.abs((s.charAt(i)-'a')-(st.peek()-'a'))==1 ||  Math.abs((s.charAt(i)-'a')-(st.peek()-'a'))==25 )){
                st.pop();
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                st.push(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}