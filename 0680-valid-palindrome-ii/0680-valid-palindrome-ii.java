class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return palindr(i+1,j,s) || palindr(i,j-1,s);
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean palindr(int start,int end,String s){
        while(start<end){
        if(s.charAt(start++)!=s.charAt(end--)){return false;}
        }
        return true;
    }
}