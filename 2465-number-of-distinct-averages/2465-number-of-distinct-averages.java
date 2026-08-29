class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> st=new HashSet<>();
        int l=0;
        int r=nums.length-1;
        while(l<r){
           // double avg=((double)nums[l]+(double)nums[r])/2.0;
            st.add(nums[l]+nums[r]);
            l++;
            r--;
        }
        return st.size();
    }
}