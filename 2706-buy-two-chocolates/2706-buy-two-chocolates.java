class Solution {
    public int buyChoco(int[] prices, int money) {
        if(prices.length==1){
            return money;
        }
        int s=prices[0];
        int ss=Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<s){
                ss=s;
                s=prices[i];
            }
            else if(prices[i]>=s && prices[i]<ss){
                ss=prices[i];
            }
        }
        int sum=s+ss;
        if(sum<=money)return money-sum;
        return money;
    //     Arrays.sort(prices);
    //     int sum=prices[0]+prices[1];
    //     if(sum<=money)return money-sum;
    //     return money;
    }
}