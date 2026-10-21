class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a, b)->map.get(b)-map.get(a)); 
        //Arrays.sort(arr,(a,b)->map.get(b)-map.get(a));
        // int cnt=0;
        // int ans=0;
        // for(int num:map.keySet()){
        //     if(cnt<(arr.length/2)){
        //         ans++;
        //         cnt+=map.get(num);
        //     }
        // }
      int cnt = 0, ans = 0;
for (int num : list) {
    if (cnt < arr.length / 2) {
        ans++;
        cnt += map.get(num);
    }
}
        return ans;
    }
}