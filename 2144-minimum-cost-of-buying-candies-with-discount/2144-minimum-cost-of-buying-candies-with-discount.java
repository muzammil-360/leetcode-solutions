class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1)return cost[0];
        Arrays.sort(cost);
        int ans=0;
        int i=cost.length-1;
        while(i>=0){
            int j=i-1;
            if(j<0){
                ans+=cost[i];
                break;
                }
            ans+=(cost[i]+cost[j]);
            i=j-2;
        }
        return ans;
    }
}