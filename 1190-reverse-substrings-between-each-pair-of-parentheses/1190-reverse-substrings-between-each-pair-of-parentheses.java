class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                st.push(s.charAt(i));
            }
            else{
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.peek());
                    st.pop();
                }
                st.pop();
                for(int j=0;j<sb.length();j++){
                    st.push(sb.charAt(j));
                }
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        str.reverse();
        return str.toString();
    }
}