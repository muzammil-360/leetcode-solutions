class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                if(set.size()>maxLetters)break;
                if(j-i+1>=minSize && j-i+1<=maxSize){
                    String str=s.substring(i,j+1);
                    map.put(str,map.getOrDefault(str,0)+1);
                    ans=Math.max(ans,map.get(str));
                }
            }
        }
        return ans;
    }
}