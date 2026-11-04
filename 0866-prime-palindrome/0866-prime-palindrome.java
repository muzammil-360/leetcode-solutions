class Solution {
    public int primePalindrome(int n) {
        int num=n;
        while(n>0){
            if(palindrome(num) && prime(num)){
                return num;
            }
            num++;
            if(num>10_000_000 && num<100_000_000){
                num=100_000_000;
            }
        }
        return num;
    }
    public boolean prime(int n){
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                cnt++;
                if((n/i)!=i){cnt++;}
            }
            if(cnt>2)break;
        }
        if(cnt==2)return true;
        return false;
    }
    public boolean palindrome(int n){
    if(n<0) return false;
    int num=n;
    int rev=0;
    while(num>0){
        int ld=num%10;
        rev=rev*10+ld;
        num/=10;
       }
    if(rev==n){
        return true;
       }
    return false;
    }
}