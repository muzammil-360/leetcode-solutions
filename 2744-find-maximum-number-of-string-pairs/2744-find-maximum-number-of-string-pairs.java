class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int cnt=0;
        for(String s:words){
            String rev=new StringBuilder(s).reverse().toString();
            cnt+=map.getOrDefault(rev,0);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return cnt;
    }
}