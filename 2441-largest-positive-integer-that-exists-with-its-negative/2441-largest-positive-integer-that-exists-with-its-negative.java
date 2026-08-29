class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int ans=Integer.MIN_VALUE;
        for(int num:st){
            if(num>0){
                if(st.contains(-num)){
                    ans=Math.max(ans,num);
                }
            }
        }
        if(ans!=Integer.MIN_VALUE)return ans;
        return -1;
    }
}