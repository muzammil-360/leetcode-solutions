class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for(List<String> list:responses){
            HashSet<String> set=new HashSet<>(list);
            for(String str:set){
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        int maxFreq = 0;
        String ans = "";
        for(String response : map.keySet()){
            int freq = map.get(response);
            if(freq > maxFreq){
                maxFreq = freq;
                ans = response;
            }
            else if(freq == maxFreq && response.compareTo(ans) < 0){
                    ans = response;
            }
        }
        return ans;
    }
}