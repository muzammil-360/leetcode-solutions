class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] freq=new int[n*n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                freq[grid[i][j]-1]+=1;
            }
        }
        int[] ans=new int[2];
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){ans[0]=i+1;}
            if(freq[i]==0){ans[1]=i+1;}
        }
        return ans;
    }
}