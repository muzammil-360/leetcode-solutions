class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        HashMap<Integer,Integer> freqcnt=new HashMap<>();
        for(int x:freq.keySet()){
            freqcnt.put(freq.get(x),freqcnt.getOrDefault(freq.get(x),0)+1);
        }
        for(int x:nums){
            if(freqcnt.get(freq.get(x))==1)return x;
        }
        return -1;
    }
}