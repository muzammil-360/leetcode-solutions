class Solution {
    public int numTrees(int n) {
        //CATALAN SEREIS-->{ 2nCn/n+1 }
        long a=ncr(2*n,n);
        long b=n+1;
        long ans=a/b;
        return (int)ans;
    }
    private long ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res*=(long)(n-i);
            res/=(long)i+1;
        }
        return res;
    }
}