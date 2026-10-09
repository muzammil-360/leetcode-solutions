class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int sh=Integer.parseInt(startTime.substring(0,2));
        int eh=Integer.parseInt(endTime.substring(0,2));
        int sm=Integer.parseInt(startTime.substring(3,5));
        int em=Integer.parseInt(endTime.substring(3,5));
        int ss=Integer.parseInt(startTime.substring(6,8));
        int es=Integer.parseInt(endTime.substring(6,8));
        int diffH=(eh-sh)*3600;
        int diffM=(em-sm)*60;
        int diffS=es-ss;
        return diffH+diffM+diffS;
    }
}