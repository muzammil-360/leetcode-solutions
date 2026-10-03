class Solution {
    public int findComplement(int num) {

        int mask=0;
        int temp=num;
        while(temp>0){
            mask=(mask<<1)|1;
            temp>>=1;
        }
        return mask^num;


    //     String st=dtb(num);
    //     char[] arr=st.toCharArray();
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]=='1'){arr[i]='0';}
    //         else if(arr[i]=='0'){arr[i]='1';}
    //     }
    //     return btd(new String(arr));
    // }
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
}