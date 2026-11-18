class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse=NSE(arr);
        int[] pse=PSE(arr);
        long mod=1000000007;
        long ans=0;
        for(int i=0;i<arr.length;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            long contribution=(left*right*(long)arr[i])%mod;
            ans=(ans+contribution)%mod;
        }
        return (int)ans;
    }
    public int[] NSE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            ans[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] PSE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
}