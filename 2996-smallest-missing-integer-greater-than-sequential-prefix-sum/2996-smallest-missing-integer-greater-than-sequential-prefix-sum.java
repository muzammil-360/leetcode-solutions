class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1)return nums[nums.length-1]+1;
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       int[] pref=new int[nums.length];
       pref[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        pref[i]=pref[i-1]+nums[i];
       }
       int longp=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]+1){
            longp=pref[i-1];
            break;
        }
        //else{break;}
       } 
       if (longp==0){return pref[nums.length-1];}
       while(true){
        if(set.contains(longp)){
            longp=longp+1;
        }
        else{
            break;
        }
       }
      return longp;
    }
}