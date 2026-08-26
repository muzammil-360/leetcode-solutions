class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt=0;
        int i=0;
        int j=0;
        while(i<startTime.length && j<endTime.length){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime ){
                cnt++;
                i++;
                j++;
                }
                else{i++;j++;}
        }
        return cnt;
    }
}