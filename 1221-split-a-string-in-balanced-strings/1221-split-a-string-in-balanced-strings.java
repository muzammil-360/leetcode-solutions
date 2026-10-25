class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int cnt=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='L'){cnt++;}
            else{cnt--;}
            if(cnt==0){ans++;}
            i++;
        }
        return ans;
    }
}