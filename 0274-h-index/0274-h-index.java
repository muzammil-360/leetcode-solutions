class Solution {
    public int hIndex(int[] citations) {
        // Arrays.sort(citations);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<citations.length;i++){
            max=Math.max(max,citations[i]);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean h=maxh(citations,mid);
            if(h==true)low=mid+1;
            else{high=mid-1;}
        }
        return high;
    }
    boolean maxh(int[] citations,int k){
        int cit=0;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=k){
                cit++;
            }
        }
        if(cit>=k)return true;
        return false;
    }
}