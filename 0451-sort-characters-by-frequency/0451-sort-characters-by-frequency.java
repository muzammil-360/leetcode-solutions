class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(char ch:ls){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        String str=sb.toString();
        return str;
    }
}