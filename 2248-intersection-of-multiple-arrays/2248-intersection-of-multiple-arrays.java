class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] arr=new int[1000];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] num:nums){
            for(int n:num){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int len=nums.length;
        for(int x:map.keySet()){
            if(map.get(x)==len){
                arr[x-1]=x;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int num:arr){
            if(num!=0){
                ans.add(num);
            }
        }
        return ans;
    }
}