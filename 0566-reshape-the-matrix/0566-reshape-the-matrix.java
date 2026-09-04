class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length)!=(r*c))return mat;
        if(mat.length==1 && mat[0].length==1)return mat;
        int[][] rmat=new int[r][c];
        int m=0;
        int n=0;
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                rmat[m][n]=mat[i][j];
                n++;
                if(n==c){
                    m++;
                    n=0;
                }
            }
        }
        return rmat;
    }
}