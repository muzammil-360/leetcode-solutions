class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxrow=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            maxrow[i]=maxarr(grid[i]);
        }
        int[] maxcol=new int[grid.length];
        for(int j=0;j<grid[0].length;j++){
            int maximum=0;
            for(int i=0;i<grid.length;i++){
                maximum=Math.max(maximum,grid[i][j]);
            }
            maxcol[j]=maximum;
        }
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum=sum+(Math.min(maxrow[i],maxcol[j])-grid[i][j]);
            }
        }
        return sum;
    }
    int maxarr(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=Math.max(arr[i],maxi);
            }
        }
        return maxi;
    }
}