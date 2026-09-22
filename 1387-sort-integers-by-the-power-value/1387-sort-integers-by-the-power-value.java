class Solution {
    public int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int temp=lo;
        while(temp>=lo && temp<=hi){
            int num=temp;
            int cnt=0;
            while(num!=1){
                if(num%2==0){
                    num/=2;
                    cnt++;
                }
                else{
                    num=3*num+1;
                    cnt++;
                }
            }
            map.put(temp,cnt);
            temp++;
        }
        List<Integer> ls=new ArrayList<>(map.keySet());
        ls.sort((a,b)->{
            if(map.get(a)!=map.get(b))return map.get(a)-map.get(b);
            else{
                return a-b;
            }
        });
        return ls.get(k-1);
    }
}