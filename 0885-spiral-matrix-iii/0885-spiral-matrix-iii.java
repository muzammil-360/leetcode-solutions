class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans=new int[rows*cols][2];
        int r=rStart;
        int c=cStart;
        int step=1;
        int cnt=0;
        ans[cnt++]=new int[]{r,c};
        while(cnt<rows*cols){
            for(int i=0;i<step;i++){
                c++;
                if(r>=0 && c>=0 && r<rows && c<cols){
                    ans[cnt++]=new int[]{r,c};
                }
            }
            for(int i=0;i<step;i++){
                r++;
                if(r>=0 && c>=0 && r<rows && c<cols){
                    ans[cnt++]=new int[]{r,c};
                }
            }
            step++;
            for(int i=0;i<step;i++){
                c--;
                if(r>=0 && c>=0 && r<rows && c<cols){
                    ans[cnt++]=new int[]{r,c};
                }
            }
            for(int i=0;i<step;i++){
                r--;
                if(r>=0 && c>=0 && r<rows && c<cols){
                    ans[cnt++]=new int[]{r,c};
                }
            }
            step++;
        }
        return ans;
    }
}