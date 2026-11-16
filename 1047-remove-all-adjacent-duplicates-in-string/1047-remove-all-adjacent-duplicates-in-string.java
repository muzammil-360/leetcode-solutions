class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(!st.isEmpty() && st.peek()-'a'==s.charAt(i)-'a'){
                st.pop();
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                st.push(s.charAt(i));
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}