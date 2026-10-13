class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(long)(nums[i]*nums[i]);
        }
        Arrays.sort(arr);
        long sum=0;
        int k=nums.length/2;
        for(int i=0;i<k;i++){
            sum-=arr[i];
        }
        for(int i=k;i<nums.length;i++){
            sum+=arr[i];
        }
        return sum;
        }
}