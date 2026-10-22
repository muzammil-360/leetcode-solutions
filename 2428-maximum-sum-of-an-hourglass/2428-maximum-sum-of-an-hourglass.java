class Solution {
    public int maxSum(int[][] grid) {
        int ans=Integer.MIN_VALUE;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=1;i<r-1;i++){
            for(int j=1;j<c-1;j++){
                int sum=
                        grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1]  +  grid[i][j]  +  grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}