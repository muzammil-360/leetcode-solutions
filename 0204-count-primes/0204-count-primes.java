class Solution {
    public int countPrimes(int n) {
        // if(n<=1)return 0;
        // int[] arr=new int[n+1];
        // for(int i=2;i<arr.length;i++){
        //     arr[i]=1;
        // }
        // for(int i=2;i*i<=n;i++){
        //     if(arr[i]==1){
        //         for(int j=i*i;j<=n;j+=i){
        //             arr[j]=0;
        //         }
        //     }
        // }
        // int cnt=0;
        // for(int i=2;i<arr.length;i++){
        //     if(arr[i]==1){cnt++;}
        // }
        // int cnt1=0;
        // for(int i=1;i*i<=n;i++){
        //     if(n%i==0){
        //         cnt1++;
        //         if((n/i)!=i){cnt1++;}
        //     }
        //     if(cnt1>2){break;}
        // }
        // if(cnt1==2){return cnt-1;}
        // return cnt;


        if (n <= 2) return 0;

        // isPrime[i] will be true if i is prime
        boolean[] isPrime = new boolean[n];
        
        // Assume all numbers >= 2 are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve process
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count prime numbers strictly less than n
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}