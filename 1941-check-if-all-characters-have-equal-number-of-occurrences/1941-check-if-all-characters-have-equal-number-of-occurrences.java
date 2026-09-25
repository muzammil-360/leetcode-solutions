class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(char ch:map.keySet()){
            set.add(map.get(ch));
        }
        if(set.size()!=1)return false;
        return true;
    }
}