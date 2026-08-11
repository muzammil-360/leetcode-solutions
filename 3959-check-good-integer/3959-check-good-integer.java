class Solution {
    public boolean checkGoodInteger(int n) {
       long s=0;
       long s2=0;
       while(n>0){
        int ld=n%10;
        s+=ld;
        s2+=ld*ld;
        n/=10;
       }
        if(s2-s>=50){return true;}
        return false;
    }
}