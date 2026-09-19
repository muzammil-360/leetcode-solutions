class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ms=new HashMap<>();
        HashMap<Character,Character> mt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(ms.containsKey(cs) && ms.get(cs)!=ct)return false;
            if(mt.containsKey(ct) && mt.get(ct)!=cs)return false;
            ms.put(cs,ct);
            mt.put(ct,cs);
        }
        return true;
    }
}