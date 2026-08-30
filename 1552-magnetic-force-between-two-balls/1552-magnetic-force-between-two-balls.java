class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<position.length;i++){
        //     max=Math.max(max,position[i]);
        //     min=Math.min(min,position[i]);
        // }
        // for(int i=1;i<=(max-min);i++){
        //     boolean cntforce=force(position,i,m);
        //     if(cntforce==true){continue;}
        //     else{
        //         return i-1;
        //     }
        // }
        // return -1;

        long low=1;
        long high=(long)position[position.length-1]-(long)position[0];
        while(low<=high){
            long mid=low+(high-low)/2;
            boolean cntforce=force(position,mid,m);
            if(cntforce==true)low=mid+1;
            else{high=mid-1;}
        }
        return (int)high;
    }
    boolean force(int[] position,long d, int m){
        int cntballs=1;
        long last=position[0];
        for(int i=1;i<position.length;i++){
            if((long)position[i]-last>=d){
                cntballs++;
                last=position[i];
            }
        }
        if(cntballs>=m)return true;
        return false;
    }
}