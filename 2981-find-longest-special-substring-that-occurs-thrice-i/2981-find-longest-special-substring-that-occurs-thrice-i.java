class Solution {
    public int maximumLength(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                map.put(s.substring(i,j+1),map.getOrDefault(s.substring(i,j+1),0)+1);
            }
        }
        int ans=-1;
        for(String str:map.keySet()){
            HashSet<Character> set=new HashSet<>();
            if(map.get(str)>=3){
                for(char ch:str.toCharArray()){
                    set.add(ch);
                }
                if(set.size()==1){ans=Math.max(ans,str.length());}
            }
        }
        return ans;
    }
}