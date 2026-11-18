class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            HashMap<Character,Character> ms=new HashMap<>();
            HashMap<Character,Character> mt=new HashMap<>();
            String str=words[i];
            boolean match=true;
            for(int j=0;j<str.length();j++){
            char cs=pattern.charAt(j);
            char ct=str.charAt(j);
            if(ms.containsKey(cs) && ms.get(cs)!=ct){match=false;break;}
            if(mt.containsKey(ct) && mt.get(ct)!=cs){match=false;break;}
            ms.put(cs,ct);
            mt.put(ct,cs);
            }
            if(match){ans.add(str);}
        }
        return ans;
    }
}