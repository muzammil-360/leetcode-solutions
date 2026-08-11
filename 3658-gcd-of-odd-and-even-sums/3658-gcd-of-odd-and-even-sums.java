class Solution {
    public int gcdOfOddEvenSums(int n) {
      long soo=n*n;
        long soe=n*(n+1);
        while(soo>0 && soe>0){
            if(soo>soe){soo%=soe;}
            else{soe%=soo;}
        }
        if(soo==0) {return (int)soe;}
         if(soe==0) {return (int)soo;}
         return -1;
    }
}