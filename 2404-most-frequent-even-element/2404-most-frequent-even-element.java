class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->{
            if(map.get(a)!=map.get(b)){return map.get(b)-map.get(a);}
            return a-b;
        });
        for(int num:ls){
            if(num%2==0){return num;}
        }
        return -1;
    }
}