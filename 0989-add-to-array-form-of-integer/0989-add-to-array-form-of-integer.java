class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
        // long val=0;
        // for(int i=0;i<num.length;i++){
        //     val=(long)(val*10+num[i]);
        // }
        // long ans=val+(long)k;
        // List<Long> ls=new ArrayList<>();
        // while(ans>0){
        //     long ld=ans%10;
        //     ls.add(ld);
        //     ans/=10;
        // }
        // Collections.reverse(ls);
        // List<Integer> list=new ArrayList<>();
        // for (long x : ls) {
        //     list.add((int)x);
        // }
        // return list;
    }
}