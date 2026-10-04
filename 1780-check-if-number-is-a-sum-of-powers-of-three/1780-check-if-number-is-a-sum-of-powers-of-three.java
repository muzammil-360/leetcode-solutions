class Solution {
    public boolean checkPowersOfThree(int n) {
        String str=dtb(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='2')return false;
        }
        return true;
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

    String dtb(int num){
        StringBuilder s=new StringBuilder();
        while(num!=0){
            if(num%3==2){
                s.append('2');
            }
            else if(num%3==1){s.append('1');}
            else{s.append('0');}
            num/=3;
        }
        // if(num==1)s.append('1');
        // if(num==2)s.append('2');
        s.reverse();
        String str=s.toString();
        return str;
    }
}