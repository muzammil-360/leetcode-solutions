class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int A1=Math.abs((ax2-ax1)*(ay2-ay1));
        int A2=Math.abs((bx2-bx1)*(by2-by1));
        int merge_width=Math.max(0,(Math.min(ax2,bx2)-Math.max(ax1,bx1)));
        int merge_heigth=Math.max(0,(Math.min(ay2,by2)-Math.max(ay1,by1)));
        int A3=merge_width*merge_heigth;
        return A1+A2-A3;
    }
}