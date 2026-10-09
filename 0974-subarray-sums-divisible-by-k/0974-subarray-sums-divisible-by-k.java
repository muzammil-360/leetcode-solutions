class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int cnt=0;
        for(int num:nums){
            sum=(sum+num)%k;
            sum=(sum+k)%k;
            if(map.containsKey(sum)){
                cnt+=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}