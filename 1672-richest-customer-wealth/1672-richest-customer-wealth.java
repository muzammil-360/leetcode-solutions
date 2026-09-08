class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            wealth=Math.max(sum,wealth);
            sum=0;
        }
        return wealth;
    }
}