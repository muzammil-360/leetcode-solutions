class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int maxi=0;
        for(int i=0;i<candies.length;i++){
        if(candies[i]>maxi){
            maxi=candies[i];
        }
        }
        int maximum=maxi;
         for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=maximum){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
         }
         return ans;
    }
}