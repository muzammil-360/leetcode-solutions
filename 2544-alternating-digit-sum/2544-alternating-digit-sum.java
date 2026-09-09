class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> ls=new ArrayList<>();
        while(n>0){
            int ld=n%10;
            ls.add(ld);
            n/=10;
        }
        Collections.reverse(ls);
        int[] arr=new int[ls.size()];
        int psum=0;
        int nsum=0;
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
            if(i%2==0){psum+=arr[i];}
            else{nsum+=arr[i];}
        }
        return psum-nsum;
    }
}