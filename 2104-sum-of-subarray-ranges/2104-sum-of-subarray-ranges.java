class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMax(nums)-sumSubarrayMins(nums);
    }

    //Find the subarray Minimum...
    public long sumSubarrayMins(int[] arr) {
        int[] nse=NSE(arr);
        int[] pse=PSE(arr);
        //long mod=1000000007;
        long ans=0;
        for(int i=0;i<arr.length;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            long contribution=(left*right*(long)arr[i]);
            ans=(ans+contribution);
        }
        return ans;
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

    //Find the subarray Maximum...
    public long sumSubarrayMax(int[] arr) {
        int[] nge=NGE(arr);
        int[] pge=PGE(arr);
        //long mod=1000000007;
        long ans=0;
        for(int i=0;i<arr.length;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            long contribution=(left*right*(long)arr[i]);
            ans=(ans+contribution);
        }
        return ans;
    }
    public int[] NGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            ans[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] PGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return ans;
    }
}