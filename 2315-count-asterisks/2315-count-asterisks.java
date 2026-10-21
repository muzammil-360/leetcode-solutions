class Solution {
    public int countAsterisks(String s) {
       int ans=0;
       int i=0;
       while(i<s.length()){
        if(s.charAt(i)=='|'){
            i++;
            while(s.charAt(i)!='|'){i++;}
            i++;
        }
        else{
        if(s.charAt(i)=='*')ans++;
        i++;
       } 
       }
       return ans;
    }
}