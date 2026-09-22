class Solution {
    public int buyChoco(int[] prices, int money) {
        if(prices.length==1){
            return money;
        }
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(sum<=money)return money-sum;
        return money;
    }
}