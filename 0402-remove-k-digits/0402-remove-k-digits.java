class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()-'0'>num.charAt(i)-'0'){
                k--;
                st.pop();
            }
            st.push(num.charAt(i));
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
            }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){sb.append(st.pop());}
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)!='0'){break;}
            else{
                sb.deleteCharAt(i);
            }
        }
        if(sb.length()==0){return "0";}
        sb.reverse();
        return sb.toString();
    }
}