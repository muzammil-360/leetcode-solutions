class Solution {
    public int maxBalancedShipments(int[] weight) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(int i=0;i<weight.length;i++){
            if(!st.isEmpty() && weight[i]<st.peek()){
                ans++;
                st.clear();
            }
            else{
                st.push(weight[i]);
            }
        }
        return ans;
    }
}