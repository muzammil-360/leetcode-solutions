class Solution {
    public int[][] generateMatrix(int num) {
        int[] arr=new int[num*num];
        for(int i=1;i<=(num*num);i++){
            arr[i-1]=i;
        }
        int[][] matrix=new int[num][num];
         int n=matrix.length;
         int m=matrix[0].length;
         int left=0;  int rigth=m-1;
         int top=0;   int bottom=n-1;
         int ind=0;
         while(left<=rigth&&top<=bottom){
            for(int i=left;i<=rigth;i++){
               // list.add(matrix[top][i]);
               matrix[top][i]=arr[ind++];
            }
            top++;
            for(int i=top;i<=bottom;i++){
               // list.add(matrix[i][rigth]);
                matrix[i][rigth]=arr[ind++];
            }
            rigth--;
            if(top<=bottom){
            for(int i=rigth;i>=left;i--){
               // list.add(matrix[bottom][i]);
                matrix[bottom][i]=arr[ind++];
            }
            bottom--;
            }
            if(left<=rigth){
            for(int i=bottom;i>=top;i--){
               // list.add(matrix[i][left]);
               matrix[i][left]=arr[ind++];
            }
            left++;
            }
         }
         return matrix;
    }
}