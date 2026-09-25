class Solution {
    public long gcdSum(int[] nums) {
        int max=nums[0];
        int[] mx=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)max=nums[i];
            mx[i]=max;
        }
        int[] pregcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int val=gcd(nums[i],mx[i]);
            pregcd[i]=val;
        }
        Arrays.sort(pregcd);
        long sum=0;
        int left=0;
        int right=pregcd.length-1;
        while(left<right){
            int ans=gcd(pregcd[left],pregcd[right]);
            sum+=ans;
            left++;
            right--;
        }
        return sum;
    }
    int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b)a%=b;
            else{
                b%=a;
            }
        }
        if(a==0)return b;
        return a;
    }
}