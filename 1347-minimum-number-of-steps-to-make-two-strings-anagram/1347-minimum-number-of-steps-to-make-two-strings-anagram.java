class Solution {
    public int minSteps(String s, String t) {
        char[] sarr=s.toCharArray();
        HashMap<Character,Integer> smap=new HashMap<>();
        for(char ch:sarr){
            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }
        char[] tarr=t.toCharArray();
        HashMap<Character,Integer> tmap=new HashMap<>();
        for(char ch:tarr){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        // for (char ch : smap.keySet()){
        //     if(!tmap.containsKey(ch)){
        //         cnt+=smap.get(ch);
        //     }
        //     else{
        //         int diff=smap.get(ch)-tmap.get(ch);
        //         if(diff>=0){cnt+=diff;}
        //         else{cnt+=0;}
        //     }
        // }
        for(char ch : smap.keySet()){

    int sFreq = smap.get(ch);
    int tFreq = tmap.getOrDefault(ch, 0);

    if(sFreq > tFreq){
        cnt += sFreq - tFreq;
    }
}
        return cnt;
    }
}