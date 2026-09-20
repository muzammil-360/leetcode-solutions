class Solution {
    public String longestPalindrome(String s) {
        String lps=s.substring(0,1);
        for(int i=1;i<s.length();i++){
            int low=i;int high=i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            String str=s.substring(low+1,high);
            if(str.length()>lps.length()){lps=str;}
             low=i-1; high=i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            str=s.substring(low+1,high);
            if(str.length()>lps.length()){lps=str;}
        }
        return lps;
    }
}