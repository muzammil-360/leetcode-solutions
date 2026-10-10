class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int min=Integer.MAX_VALUE;
        for(int num:time){
            if(num<min){min=num;}
        }
        long low=1;
        long high=(long)min*totalTrips;
        while(low<=high){
            long mid=low+(high-low)/2;
            long tt=functt(time,mid);
            if(tt>=(long)totalTrips){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    long functt(int[] nums,long n){
        long sum=0;
        for(int num:nums){
            sum+=(long)(n/num);
        }
        return sum;
    }
}