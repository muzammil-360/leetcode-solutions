class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            sb.append(sum%2);
            carry=sum/2;
        }
        sb.reverse();
        String str=sb.toString();
        return str;


        // if(a.equals("0") && b.equals("0") ){return a;}
        // if(a.equals("0"))return b;
        // if(b.equals("0"))return a;
        // int sum=(btd(a))+(btd(b));
        // return dtb(sum);

    }

    // int btd(String s){
    //     int num=0;
    //     int p2=1;
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
    //     while(num!=1){
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
}