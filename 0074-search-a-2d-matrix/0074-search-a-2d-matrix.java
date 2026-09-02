class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i=0;i<matrix.length;i++){
        //     if(matrix[i][0]<=target && target<=matrix[i][matrix[0].length-1]);
        //     return bs(matrix[i],target);
        // }
        // return false;

        int low=0;
        int high=(matrix.length*matrix[0].length-1);
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/matrix[0].length;
            int col=mid%matrix[0].length;
            if(matrix[row][col]==target)return true;
            else if(matrix[row][col]<target)low=mid+1;
            else{high=mid-1;}
        }
        return false;
    }
    // boolean bs(int[] matrix,int target){
    //               int low=0;
    //     int high=matrix.length-1;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;
    //         if(matrix[mid]==target)return true;
    //         else if(matrix[mid]>target){
    //             high=mid-1;
    //         }
    //         else{
    //             low=mid+1;
    //         }
    //     }
    //    return false;
    // }
}