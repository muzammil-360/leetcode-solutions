class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int val=sum(i);
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int max=-1;
        for(int num:map.keySet()){
            max=Math.max(max,map.get(num));
        }
        int res=0;
        for(int num:map.keySet()){
           if(map.get(num)==max)res++;
        }
        return res;
    }
    public int sum(int n){
        int ans=0;
        while(n>0){
            int ld=n%10;
            ans+=ld;
            n/=10;
        }
        return ans;
    }
}