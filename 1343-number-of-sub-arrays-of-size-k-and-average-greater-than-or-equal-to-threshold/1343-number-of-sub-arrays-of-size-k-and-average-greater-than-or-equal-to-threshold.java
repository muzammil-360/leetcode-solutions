class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(k==arr.length){
            if((sum/k)>=threshold)return 1;
            else{return 0;}
        }
        int maxcnt=0;
        int cnt=0;
        int average=(sum/k);
        if(average>=threshold){cnt++;}
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if((sum/k)>=threshold){cnt++;}
           maxcnt=Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}