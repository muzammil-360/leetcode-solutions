class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans=new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while(!dq.isEmpty() && i-k>=dq.peekFirst()){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1){
                ans[i-k+1]=nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}