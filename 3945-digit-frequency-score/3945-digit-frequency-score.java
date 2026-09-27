class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int temp=n;
        while(temp>0){
            int ld=temp%10;
            map.put(ld,map.getOrDefault(ld,0)+1);
            temp/=10;
        }
        int sum=0;
        for(int num:map.keySet()){
            sum+=(num*map.get(num));
        }
        return sum;
    }
}