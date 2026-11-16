class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        int depth=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){depth++;}
            else{
                depth--;
                if(s.charAt(i-1)=='('){ans=ans+(1<<depth);}
            }
            i++;
        }
        return ans;
    }
}