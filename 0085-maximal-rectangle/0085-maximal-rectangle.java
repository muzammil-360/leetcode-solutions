class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] premat=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=matrix[i][j]-'0';
                if(matrix[i][j]-'0'==0){sum=0;}
                premat[i][j]=sum;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,largestRectangleArea(premat[i]));
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                int x=st.pop();
                int h=heights[x];
                int nse=i;
                int pse=st.isEmpty()?-1:st.peek();
                ans=Math.max(ans,(nse-pse-1)*h);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int x=st.pop();
            int h=heights[x];
            int nse=heights.length;
            int pse=st.isEmpty()?-1:st.peek();
            ans=Math.max(ans,(nse-pse-1)*h);
        }

        return ans;
    }
}