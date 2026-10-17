class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int bob=piles.length/3;
        int ans=0;
        for(int i=bob;i<piles.length;i+=2){
            ans+=piles[i];
        }
        return ans;
    }
}