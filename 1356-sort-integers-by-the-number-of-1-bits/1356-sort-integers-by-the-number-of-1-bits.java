class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] ans=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans,(a,b)->{
            int sa=setbit(a);
            int sb=setbit(b);
            if(sa!=sb){
                return Integer.compare(sa,sb);
            }
            else{
                return Integer.compare(a,b);
            }
        });
         for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        return arr;
    }
    int setbit(int num){
        int cnt=0;
        while(num>0){
            num=num & (num-1);
            cnt++;
        }
        return cnt;
    }
}