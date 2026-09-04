class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> st=new HashSet<>();
        for(int num:friends){
            st.add(num);
        }
        int[] ans=new int[friends.length];
        int k=0;
        for(int num:order){
            if(st.contains(num)){
                ans[k++]=num;
            }
        }
        return ans;
    }
}