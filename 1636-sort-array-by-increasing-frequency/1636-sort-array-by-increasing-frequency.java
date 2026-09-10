class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->{
            if(map.get(a)!=map.get(b)){return map.get(a)-map.get(b);}
            return b-a;
        });
        
        int[] ans=new int[nums.length];
        int ind=0;
        for(int num:ls){
            for(int i=0;i<map.get(num);i++){
                ans[ind++]=num;
            }
        }
        return ans;
    }
}