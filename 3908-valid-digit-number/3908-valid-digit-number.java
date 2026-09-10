class Solution {
    public boolean validDigit(int n, int x) {
        boolean b=false;
        int cnt=0;
        int temp=n;
        while(temp>0){
            int ld=temp%10;
            if(ld==x){b=true;}
            cnt++;
            temp/=10;
        }
        double num=n/(Math.pow(10,cnt-1));
        if(((int)num)!=x && b==true)return true;
        return false;
    }
}