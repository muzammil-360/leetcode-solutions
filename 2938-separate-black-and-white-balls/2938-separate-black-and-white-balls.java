class Solution {
    public long minimumSteps(String s) {
        long cnt=0;
        long bl=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                cnt+=bl;
            }
            else{
                bl++;
            }
        }
        return cnt;
    }
}