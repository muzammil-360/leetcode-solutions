class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int maxGas=0;
        int maxCost=0;
        for(int i=0;i<gas.length;i++){
            maxGas+=gas[i];
            maxCost+=cost[i];
        }
        if(maxGas<maxCost)return -1;
        int ans=0;
        int currGas=0;
        for(int i=0;i<gas.length;i++){
            currGas+=(gas[i]-cost[i]);
            if(currGas<0){
                ans=i+1;
                currGas=0;
            }
        }
        return ans;
    }
}