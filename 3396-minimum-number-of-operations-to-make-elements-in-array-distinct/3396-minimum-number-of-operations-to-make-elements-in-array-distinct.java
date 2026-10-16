class Solution {
    public int minimumOperations(int[] nums) {
        int cnt=0;
        int i=0;
        while(i<nums.length){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(set.contains(nums[j])){
                    break;
                }
                set.add(nums[j]);
            }
            if(set.size()!=(nums.length-i))cnt++;
            i+=3;
        }   
        return cnt;
    }
}