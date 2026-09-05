class Solution {
    public int earliestTime(int[][] tasks) {
        int min_time=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int start=tasks[i][0];
            int end=tasks[i][1];
            int tsum=start+end;
            min_time=Math.min(min_time,tsum);
        }
        return min_time;
    }
}