class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
        int len=right-left;
        int wid=Math.min(height[left],height[right]);
        int a=len*wid;
        area=Math.max(area,a);
       // left++;
       if(height[left]<height[right])left++;
       else{right--;}
        }
        return area;
    }
}