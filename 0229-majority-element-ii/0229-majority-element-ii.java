class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;int cnt2=0;
        int el1=0;int el2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                 el1=nums[i];
                }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2=1;
                 el2=nums[i];
                }
            else if(nums[i]==el1){cnt1++;}
            else if(nums[i]==el2){cnt2++;}
            else {cnt1--;cnt2--;}        
        }
         int ncnt1=0;int ncnt2=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==el1){ncnt1++;}
            else if(nums[i]==el2){ncnt2++;}
         }
         List<Integer> ans=new ArrayList<>();
  int mini=(nums.length/3);
  if(ncnt1>mini){ans.add(el1);}
  if(ncnt2>mini){ans.add(el2);}
  return ans;
    }
}