class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=n^(n>>1);
        return ((x & (x+1))==0);
        // if(n==0 || n==1)return true;
        // String str=dtb(n);
        // for(int i=1;i<str.length();i++){
        //     if(str.charAt(i)==str.charAt(i-1))return false;
        // }
        // return true;
    }
        // String dtb(int num){
        // StringBuilder s=new StringBuilder();
        // while(num!=1){
        //     if(num%2==1){
        //         s.append('1');
        //     }
        //     else{s.append('0');}
        //     num/=2;
        // }
        // if(num==1)s.append('1');
        // s.reverse();
        // String str=s.toString();
        // return str;
    }
