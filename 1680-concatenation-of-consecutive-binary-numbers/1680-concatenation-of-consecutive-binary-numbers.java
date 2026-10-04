class Solution {
    public int concatenatedBinary(int n) {
        long mod=(long)(Math.pow(10,9)+7);
        long ans=0;
        int bitlength=0;
        for(int i=1;i<=n;i++){
            if((i & (i-1))==0){bitlength++;}
            ans=((ans<<bitlength)|i)%mod;
        }
        return (int)ans;
    }
}