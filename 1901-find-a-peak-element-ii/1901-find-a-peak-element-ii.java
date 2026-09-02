class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxelement(matrix,mid);
            int left=mid-1>=0?matrix[row][mid-1]:-1;
            int right=mid+1<matrix[0].length?matrix[row][mid+1]:-1;
            if(matrix[row][mid]>left && matrix[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(matrix[row][mid]<left)high=mid-1;
            else{low=mid+1;}
        }
        return new int[]{-1,-1};
    }
    int maxelement(int[][] matrix,int col){
        int maxel=-1;
        int ind=-1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]>maxel){
                maxel=matrix[i][col];
                ind=i;
            }
        }
        return ind;
    }
}