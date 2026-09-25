class Solution {
    public boolean doesAliceWin(String s) {
        int vo_cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vo_cnt++;
            }
        }
        if(vo_cnt==0)return false;
        if(vo_cnt%2==1)return true;
        return true;
    }
}