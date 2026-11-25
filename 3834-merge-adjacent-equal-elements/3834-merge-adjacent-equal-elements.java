class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(!st.isEmpty() && nums[i]==st.peek()){
                long temp=nums[i];
                while(!st.isEmpty() && temp==st.peek()){
                    if(temp==nums[i]){
                        long val=st.pop();
                        temp=st.isEmpty()?-1:st.peek();
                        st.push(2*val);
                    }
                    else{
                        long val=st.pop();
                        st.pop();
                        temp=st.isEmpty()?-1:st.peek();
                        st.push(2*val);
                    }
                }
            }
            else{
                long v=nums[i];
                st.push(v);
            }
        }
        List<Long> list=new ArrayList<>();
        while(!st.isEmpty()){
            long x=st.pop();
            list.add(x);
        }
        Collections.reverse(list);
        return list;
    }
}