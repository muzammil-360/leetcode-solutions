class Solution {
    public int minLengthAfterRemovals(String s) {
        int cnta=0;
        int cntb=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='a'){cnta++;}
            else{cntb++;}
            i++;
        }
        return Math.abs(cnta-cntb);
    }
}