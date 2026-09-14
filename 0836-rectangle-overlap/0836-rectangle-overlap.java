class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int r1x1=rec1[0];
        int r1y1=rec1[1];
        int r1x2=rec1[2];
        int r1y2=rec1[3];
        int a1=Math.abs((r1x2-r1x1)*(r1y2-r1y1));

        int r2x1=rec2[0];
        int r2y1=rec2[1];
        int r2x2=rec2[2];
        int r2y2=rec2[3];
        int a2=Math.abs((r2x2-r2x1)*(r2y2-r2y1));

        int width=Math.max(0,(Math.min(r1x2,r2x2)-Math.max(r1x1,r2x1)));
        int height=Math.max(0,(Math.min(r1y2,r2y2)-Math.max(r1y1,r2y1)));
        int a3=width*height;
        // int ans=a1+a2-a3;
        if(a3==0)return false;
        return true;
    }
}