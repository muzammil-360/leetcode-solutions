class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*(long)k>bloomDay.length)return -1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){max=bloomDay[i];}
            if(bloomDay[i]<min){min=bloomDay[i];}
        } 
        // for(int day=min;day<=max;day++){
        //     int possday=days(bloomDay,day,m,k);
        //     if(possday==1)return day;
        // }
        int low=min;
        int high=max;
        //int ans=-1...we can use also!!!
        while(low<=high){
            int mid=low+(high-low)/2;
            int possday=days(bloomDay,mid,m,k);
            if(possday==1)high=mid-1;
            else{low=mid+1;}
        }
        return low;
    }
    int days(int[] bloomDay,int d, int m, int k){
        int cnt=0;
        int bouq=0;
        for(int i=0;i<bloomDay.length;i++){
            if(d>=bloomDay[i])cnt++;
            else{
            bouq+=cnt/k;
            cnt=0;
            }
        }
       bouq+=cnt/k;
       if(bouq>=m)return 1;
       return 0; 
    }
}