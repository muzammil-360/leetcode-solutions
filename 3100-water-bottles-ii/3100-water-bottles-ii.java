class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int emptyBottles=numBottles;
        while(emptyBottles>=numExchange){
            ans+=1;
            // ans+=(emptyBottles/numExchange);
            // emptyBottles=(emptyBottles/numExchange)+(emptyBottles%numExchange);
            emptyBottles=emptyBottles-numExchange+1;
            numExchange+=1;
        }
        return ans;
    }
}