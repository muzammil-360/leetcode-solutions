class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch='A';ch<='Z';ch++){
            map.put(ch,ch-'A'+1);
        }
        int i=0;
        long ans=0;
        while(i<columnTitle.length()){
            ans=ans*26+map.get(columnTitle.charAt(i));
            i++;
        }
        return (int)ans;
    }
}