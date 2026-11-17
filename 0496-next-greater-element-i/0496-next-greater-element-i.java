class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }

        int[] ans=new int[nums1.length];

        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){st.pop();}
            if(st.isEmpty()){
                if(map.containsKey(nums2[i])){
                    ans[map.get(nums2[i])]=-1;
                }
            }
            else{
                if(map.containsKey(nums2[i])){
                    ans[map.get(nums2[i])]=st.peek();
                }
            }
            st.push(nums2[i]);
        }
        return ans;
    }
}