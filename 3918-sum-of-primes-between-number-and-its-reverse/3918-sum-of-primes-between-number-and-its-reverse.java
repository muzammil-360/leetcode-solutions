class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int temp=n;
        while(temp>0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp/=10;
        }
        int l=Math.min(n,rev);
        int r=Math.max(n,rev);
        int sum=0;
        for(int i=l;i<=r;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        if(l==1){return sum-1;}
        return sum;
    }
    public boolean isPrime(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if((n/i)!=i){
                    cnt++;
                }
            }
            if(cnt>2){break;}
        }
        if(cnt>2)return false;
        return true;
    }
}