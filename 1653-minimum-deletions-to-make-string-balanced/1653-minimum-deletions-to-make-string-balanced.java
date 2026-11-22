class Solution {
    public int minimumDeletions(String s) {
        int cntb=0;
        int del=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='b'){cntb++;}
            else{del=Math.min(del+1,cntb);}
            i++;
        }
        return del;
    }
}