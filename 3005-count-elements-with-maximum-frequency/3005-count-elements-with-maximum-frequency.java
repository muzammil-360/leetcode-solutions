class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->map.get(b)-map.get(a));
        int sum=map.get(ls.get(0));
        for(int i=1;i<ls.size();i++){
            if((map.get(ls.get(i))).equals(map.get(ls.get(i-1)))){
                sum+=map.get(ls.get(i));
            }
            else{break;}
        }
        return sum;
    }
}