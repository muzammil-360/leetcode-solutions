class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->{
            if(map.get(a)!=map.get(b))return map.get(b)-map.get(a);
            else{
                return a.compareTo(b);
            }
        });
        List<String> ans=new ArrayList<>();
        for(String s:ls){
            if(k==0){break;}
            ans.add(s);
            k--;
        }
        return ans;
    }
}