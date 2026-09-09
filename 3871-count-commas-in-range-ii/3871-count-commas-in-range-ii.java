class Solution {
    public long countCommas(long n) {
        // long number=999;
        // long ans=0;
        // while(n>number){
        //     ans+=n-number;
        //     number*=1000+999;
        // }
        // return ans;
        long count=0;
        for(long number=1000;number<=n;number*=1000){
            count+=n-number+1;
        }
        return count;
    }
}