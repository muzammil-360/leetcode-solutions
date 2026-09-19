class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int cnt=0;
        int m=0;
        for(int i=0;i<intervals.length;i++){
           if(intervals[i][1]>m){
            m=intervals[i][1];
            cnt++;
           }
        }
        return cnt;
    }
}