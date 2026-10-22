class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str=words[i];
            if(palindr(str)){return str;}
        }
        return "";
    }
    public boolean palindr(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){return false;}
        }
        return true;
    }
}