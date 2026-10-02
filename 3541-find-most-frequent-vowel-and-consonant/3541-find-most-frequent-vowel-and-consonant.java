class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int vcnt=0;
        int ccnt=0;
        for(char ch:map.keySet()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vcnt=Math.max(vcnt,map.get(ch));
            }
            else{
                ccnt=Math.max(ccnt,map.get(ch));
            }
        }
        return vcnt+ccnt;
    }
}