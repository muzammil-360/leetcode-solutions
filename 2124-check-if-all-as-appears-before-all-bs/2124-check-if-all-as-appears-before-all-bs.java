class Solution {
    public boolean checkString(String s) {
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                ind=i;
                break;
            }
            if(i==s.length()-1)return true;
        }
        //if(ind==0)return true;
        for(int i=ind;i<s.length();i++){
            if(s.charAt(i)=='a')return false;
        }
        return true;
    }
}