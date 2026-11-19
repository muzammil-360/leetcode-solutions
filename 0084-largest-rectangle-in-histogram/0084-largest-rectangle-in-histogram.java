class Solution {
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