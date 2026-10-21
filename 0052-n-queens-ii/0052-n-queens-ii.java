class Solution {
    public int totalNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int[] leftRow=new int[n];
        int[] lowerDiagonal=new int[2*n-1];
        int[] upperDiagonal=new int[2*n-1];
        solve(0,n,board,leftRow,lowerDiagonal,upperDiagonal,ans);
        return ans.size();
    }
    private void solve(int col,int n,char[][] board,int[] leftRow,int[] lowerDiagonal,int[] upperDiagonal,List<List<String>> ans){
        for(int row=0;row<n;row++){
            if(col==n){
                List<String> list=new ArrayList<>();
                for(int i=0;i<n;i++){
                    list.add(new String(board[i]));
                }
                ans.add(list);
                return;
            }
            if(leftRow[row]==0 && lowerDiagonal[col+row]==0 && upperDiagonal[n-1+col-row]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                lowerDiagonal[col+row]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1,n,board,leftRow,lowerDiagonal,upperDiagonal,ans);
                board[row][col]='.';
                leftRow[row]=0;
                lowerDiagonal[col+row]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }
    }
}