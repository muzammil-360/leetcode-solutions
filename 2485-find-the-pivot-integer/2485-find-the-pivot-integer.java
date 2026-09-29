class Solution {
    public int pivotInteger(int n) {
        int ts=(n*(n+1))/2;
        int ls=0;
        for(int i=1;i<=n;i++){
            int rs=ts-ls-i;
            if(ls==rs)return i;
            ls+=i;
        }
        return -1;
    }
}