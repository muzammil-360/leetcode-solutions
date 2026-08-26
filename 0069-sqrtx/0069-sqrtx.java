class Solution {
    public int mySqrt(int x) {
        // if(x<=1) return x;
        // double x0=x;
        // double x1=(x0+x/x0)/2.0;
        // while(Math.abs(x0-x1)>=1){
        //        x0=x1;
        //        x1=(x0+x/x0)/2.0;
        // }
        // return (int)x1;

        if(x<=1) return x;
        double ans=0;
        for(double i=1;i<=x;i++){
            if(i*i<=x){
                ans=i;
            }
            else{break;}
        }
        return (int)ans;
    }
}