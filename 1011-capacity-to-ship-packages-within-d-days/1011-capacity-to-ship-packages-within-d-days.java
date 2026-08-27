class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){max=weights[i];}
            sum+=weights[i];
        } 
        // for(int cap=max;cap<=sum;cap++){
        //     int daysreq=capacity(weights,cap);
        //     if(daysreq<=days)return cap;
        // }
        int low=max;
        int high=sum;
        //int ans=-1...we can use also!!!
        while(low<=high){
            int mid=low+(high-low)/2;
            int daysreq=capacity(weights,mid); 
            if(daysreq<=days)high=mid-1;
            else{low=mid+1;}
            }
        return low;
    }
    int capacity(int[] weights, int c){
        int day=1;
        int load=0;
         for(int i=0;i<weights.length;i++){
            if(load+weights[i]>c){
                day++;
                load=weights[i];
            }
          else{ load+=weights[i];}
         }
         return day;
    }
}