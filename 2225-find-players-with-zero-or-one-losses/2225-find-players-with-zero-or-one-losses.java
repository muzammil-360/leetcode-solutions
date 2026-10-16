class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<matches.length;i++){
            int val1=matches[i][0];
            int val2=matches[i][1];
            map.put(val2,map.getOrDefault(val2,0)+1);
            set.add(val1);
            set.add(val2);
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp1=new ArrayList<>();
        for(int x:set){
            if(!map.containsKey(x)){
                temp1.add(x);
            }
        }
        Collections.sort(temp1);
        ans.add(temp1);
        List<Integer> temp2=new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)==1){
                temp2.add(x);
            }
        }
        Collections.sort(temp2);
        ans.add(temp2);
        return ans;
    }
}