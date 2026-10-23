class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxlen=0;
        int l1=0;
        int r1=0;
        int cntf=0;
        while(r1<answerKey.length()){
            if(answerKey.charAt(r1)=='F'){cntf++;}
            if(cntf>k){
                if(answerKey.charAt(l1)=='F'){cntf--;}
                l1++;
            }
            maxlen=Math.max(maxlen,r1-l1+1);
            r1++;
        }


        int l2=0;
        int r2=0;
        int cntt=0;
        while(r2<answerKey.length()){
            if(answerKey.charAt(r2)=='T'){cntt++;}
            if(cntt>k){
                if(answerKey.charAt(l2)=='T'){cntt--;}
                l2++;
            }
            maxlen=Math.max(maxlen,r2-l2+1);
            r2++;
        }
        return maxlen;
    }
}