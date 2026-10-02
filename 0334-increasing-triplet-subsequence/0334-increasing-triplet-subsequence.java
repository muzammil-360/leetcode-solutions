class Solution {
    public boolean increasingTriplet(int[] nums) {
        int sm=Integer.MAX_VALUE;
        int ssm=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=sm){
                sm=num;
            }
            else if(num<=ssm){
                ssm=num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}