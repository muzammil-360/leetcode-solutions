class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        String ans=s+s;
        for(int i=0;i<s.length();i++){
            int j=0;
            while(j<goal.length() && ans.charAt(i+j)==goal.charAt(j)){
                j++;
            }
            if(j==goal.length())return true;
        }
        return false;
    }
}