class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length/2;i++){
           int freq=nums[2*i];
           int val=nums[2*i+1];
           while(freq>0){
            ls.add(val);
            freq--;
           }
        }
        return ls.stream().mapToInt(Integer::intValue).toArray();
    }
}