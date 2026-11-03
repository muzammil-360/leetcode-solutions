class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        int ans=0;
        for(int i=0;i<list.size();i++){
            int push=(i/8)+1;
            ans+=push*map.get(list.get(i));
        }
        return ans;
    }
}