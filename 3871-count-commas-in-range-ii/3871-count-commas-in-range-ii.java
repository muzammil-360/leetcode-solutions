class Solution {
    public long countCommas(long n) {
        long count=0;
        for(long number=1000;number<=n;number*=1000){
            count+=n-number+1;
        }
        return count;
    }
}