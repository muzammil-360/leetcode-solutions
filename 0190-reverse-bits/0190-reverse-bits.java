class Solution {
    public int reverseBits(int n) {
    //     String s1=new StringBuilder(dtb(n)).reverse().toString();
    //     long ans=btd(s1);
    //     return (int)ans;
    // }
    //     long btd(String s){
    //     long num=0;
    //     long p2=1;
    //     for(int i=s.length()-1;i>=0;i--){
    //         if(s.charAt(i)=='1'){
    //             num=num+p2;
    //         }
    //         p2=p2*2;
    //     }
    //     return num;
    // }

    // String dtb(int num){
    //     StringBuilder s=new StringBuilder();
    //     for(int i=0;i<32;i++){
    //         if(num%2==1){
    //             s.append('1');
    //         }
    //         else{s.append('0');}
    //         num/=2;
    //     }
    //     if(num==1)s.append('1');
    //     s.reverse();
    //     String str=s.toString();
    //     return str;
    // }
     int ans = 0;

        for (int i = 0; i < 32; i++) {

            int bit = n & 1;

            ans = (ans << 1) | bit;

            n >>>= 1;
        }

        return ans;
    }
}