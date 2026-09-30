class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        int val=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                ans++;
            }
            else{
                if(ans>0){ans--;}
                else{
                    val++;
                }
            }
        }
        return (ans+val);
    }
}