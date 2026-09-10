class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int cnt1=0;
        int cnt2=0;
        for(int num:map.keySet()){
            if(map.get(num)%2==1){cnt2++;}
            cnt1+=map.get(num)/2;
        }
        int[] ans=new int[2];
        ans[0]=cnt1;
        ans[1]=cnt2;
        return ans;
    }
}