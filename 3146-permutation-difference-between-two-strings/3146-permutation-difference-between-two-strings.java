class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : s.toCharArray())
            {map1.put(ch,s.indexOf(ch));}
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char ch : t.toCharArray())
            {map2.put(ch,t.indexOf(ch));}
        int sum=0;
        for(char ch:map1.keySet()){
            sum+=Math.abs(map1.get(ch)-map2.get(ch));
        }
        return sum;
    }
}