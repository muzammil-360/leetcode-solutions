class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int num:nums){
            String s=String.valueOf(num);
            for(char ch:s.toCharArray()){
                ls.add(ch-'0');
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}