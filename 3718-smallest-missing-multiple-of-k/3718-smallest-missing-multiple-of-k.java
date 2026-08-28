class Solution {
    public int missingMultiple(int[] nums, int k) {
             //  Arrays.sort(nums);
              HashSet<Integer> st = new HashSet<>();

        for (int num : nums) {
            st.add(num);
        }

        int temp=k;
        for(int num:st){
            if(st.contains(k))k+=temp;
        }
        return k;
    }
}