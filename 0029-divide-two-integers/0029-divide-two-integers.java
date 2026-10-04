class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        boolean sign=true;
        if(dividend>=0 && divisor<0)sign=false;
        if(dividend<0 && divisor>0)sign=false;
        long dvn=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        long ans=0;
        while(dvn>=dvs){
            int cnt=0;
            while(dvn>=(dvs<<(cnt+1))){cnt++;}
            ans+=(1L<<cnt);
            dvn-=(dvs<<cnt);
        }
        if(ans> Integer.MAX_VALUE && sign==true){
            return Integer.MAX_VALUE;
        }
        if(ans<Integer.MIN_VALUE && sign==false){
            return Integer.MIN_VALUE;
        }
        if(sign==false){
            return -(int)(ans);
        }
        return (int)ans;
    }
}