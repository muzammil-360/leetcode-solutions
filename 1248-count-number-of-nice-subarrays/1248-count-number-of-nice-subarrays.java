class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){nums[i]=0;}
            else{
                nums[i]=1;
            }
        }
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            }
        return cnt;
    }
}