class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int[] arr:operations){
            int a=arr[0];
            int b=arr[1];
            nums[map.get(a)]=b;
            map.put(b,map.get(a));
        }
        return nums;
    }
}