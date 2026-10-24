class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int l=0;
        int r=0;
        int cnt=0;
        int minlen=Integer.MAX_VALUE;
        int sindex=-1;
        while(r<s.length()){
            if(map.getOrDefault(s.charAt(r),0)>0)cnt++;
           map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0) - 1);
            while(cnt==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    sindex=l;
                }
                map.put(s.charAt(l), map.get(s.charAt(l)) + 1);
                if(map.get(s.charAt(l))>0)cnt--;
                l++;
            }
            r++;
        }
        return sindex==-1?"":s.substring(sindex,sindex+minlen);
    }
}