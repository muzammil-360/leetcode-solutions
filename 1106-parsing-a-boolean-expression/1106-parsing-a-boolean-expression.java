class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st=new Stack<>();
        for(char exp:expression.toCharArray()){
            if(exp==',' || exp=='('){continue;}
            else if( exp=='&' || exp=='|' || exp=='!' || exp=='t' || exp=='f'){
                st.push(exp);
            }
            else{
                boolean isTrue=false;
                boolean isFalse=false;
                while(!st.isEmpty() && st.peek()!='&' && st.peek()!='|' && st.peek()!='!'){
                    char ch1=st.pop();
                    if(ch1=='t'){isTrue=true;}
                    else{isFalse=true;}
                }
                char ch2=st.pop();
                if(ch2=='&'){
                    st.push(isFalse?'f':'t');
                }
                else if(ch2=='!'){
                    st.push(isTrue?'f':'t');
                }
                else{
                    st.push(isTrue?'t':'f');
                }
            }
        }
        return st.peek()=='t';
    }
}