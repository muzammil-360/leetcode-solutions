class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        //double[] arr=new double[prices.length];
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        double ans=0;
        while(i>=0 && j>=0){
            double d=(double)(prices[i]*(100-discounts[j]))/100;
            ans+=d;
            i--;
            j--;
        }
        if(i>=0){
            for(int k=0;k<(prices.length-discounts.length);k++){
                ans+=(double)prices[k];
            }
        }
        return ans;
    }
}