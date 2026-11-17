class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans=new int[heights.length];
        Stack<Integer> st=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            int cnt=0;
            while(!st.isEmpty() && heights[i]>=st.peek()){
                cnt++;
                st.pop();
            }
            ans[i]=st.isEmpty()?0+cnt:1+cnt;
            st.push(heights[i]);
        }
        return ans;
    }
}