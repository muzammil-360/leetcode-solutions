class Solution {
    public int maxScore(String s) {
        char[] ch=s.toCharArray();
        int cnt1=0;
        int[] pref=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){cnt1++;}
            pref[i]=cnt1;
        }
        int cnt2=0;
        int[] suff=new int[ch.length];
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]=='1'){cnt2++;}
            suff[i]=cnt2;
        }
        int maxSum=0;
        for(int i=0;i<ch.length-1;i++){
            int sum=pref[i]+suff[i+1];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}