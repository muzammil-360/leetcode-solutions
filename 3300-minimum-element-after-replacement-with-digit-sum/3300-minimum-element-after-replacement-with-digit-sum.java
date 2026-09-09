class Solution {
    public int minElement(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int sum=0;
            while(temp>0){
                int ld=temp%10;
                sum+=ld;
                temp/=10;
            }
            arr[i]=sum;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){mini=Math.min(mini,arr[i]);}
        }
        return mini;
    }
}