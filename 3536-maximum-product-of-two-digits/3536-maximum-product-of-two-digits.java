class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int m=0;
        int sm=-1;
        while(temp>0){
            int ld=temp%10;
            if(ld>=m){
                sm=m;
                m=ld;
            }
            else if(ld<m && ld>sm){
                sm=ld;
            }
           // else if(ld==m){sm=ld;}
            temp/=10;
        }
        return m*sm;
    }
}