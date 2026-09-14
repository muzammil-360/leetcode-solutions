class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:bulbs){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int num:map.keySet()){
            if((map.get(num)%2)==1){
                ans.add(num);
                }
        }
        Collections.sort(ans);
        return ans;
    }
}