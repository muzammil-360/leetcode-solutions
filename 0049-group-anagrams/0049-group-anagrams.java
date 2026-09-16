class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            // char[] arr=s.toCharArray();
            // Arrays.sort(arr);
            int[] freq=new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
            }
           // String str=new String(freq);
            String str=Arrays.toString(freq);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}