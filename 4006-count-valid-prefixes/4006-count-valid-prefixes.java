class Solution {
    public int countValidPrefixes(String s) {
        int[] prezero=new int[s.length()];
        int cnt0=0;
        int[] preone=new int[s.length()];
        int cnt1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                cnt0++;
            }
            else{
                cnt1++;
            }
            prezero[i]=cnt0;
            preone[i]=cnt1;
        }
        int ans=0;
        for(int i=0;i<prezero.length;i++){
            if(Math.abs(prezero[i]-preone[i])<=1){
                ans++;
            }
        }
        return ans;
    }
}