class Solution {
    public int commonFactors(int a, int b) {
        int m=Math.min(a,b);
        int cf=0;
        for(int i=1;i<=m;i++){
          if(a%i==0 && b%i==0)cf++;
        }
        return cf;
    }
}