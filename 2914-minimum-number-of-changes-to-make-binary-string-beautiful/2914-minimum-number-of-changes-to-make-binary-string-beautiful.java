class Solution {
    public int minChanges(String s) {
        int ans=0;
        int i=0;
        while(i<s.length()){
            int j=i+1;
            if(s.charAt(i)!=s.charAt(j)){ans++;}
            i=j+1;
        }
        return ans;
    }
}