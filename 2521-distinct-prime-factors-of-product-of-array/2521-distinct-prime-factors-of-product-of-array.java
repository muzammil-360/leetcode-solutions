class Solution {
    public int distinctPrimeFactors(int[] nums) {
    //  long num=1;
    //  for(int x:nums){
    //     num*=(long)x;
    //    }
    // int cnt=0;
    // for(long i=2;i*i<=num;i++){
    //     if(num%i==0){
    //         cnt++;
    //         while(num%i==0){num/=i;}
    //     }
    // }
    // if(num!=1)cnt++;
    // return cnt;
    HashSet<Integer> set=new HashSet<>();
    for(int num:nums){
        for(int i=2;i*i<=num;i++){
        if(num%i==0){
            set.add(i);
            while(num%i==0){num/=i;}
        }
    }
    if(num!=1)set.add(num);
    }
    return set.size();
    }
}