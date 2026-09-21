class Solution {
    public int twoCitySchedCost(int[][] costs) {
        HashMap<int[],Integer> map=new HashMap<>();
        for(int[] num:costs){
            map.put(num,(num[0]-num[1]));
        }
        List<int[]> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->map.get(a)-map.get(b));
        int n=ls.size();
        int ans=0;
        for(int i=0;i<n;i++){
            if(i<(n/2)){
               ans=ans+ls.get(i)[0]; ;
            }
            else{
                ans=ans+ls.get(i)[1];
            }
        }
        return ans;
    }
}