class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // long start=(long)Math.pow(10,num-1);
        // long end=(long)(Math.pow(10,num)-1);
        // int maxi=-1;
        // int ans=-1;
        // for(int i=(int)start;i<=(int)end;i++){
        //     int temp=i;
        //     int sumi=0;
        //     int sumisq=0;
        //     while(temp>0){
        //         int ld=temp%10;
        //         sumi+=ld;
        //         sumisq+=ld*ld;
        //         temp/=10;
        //     }
        //     if(sumi==sum){
        //         if(sumisq>=maxi){
        //             maxi=sumisq;
        //            ans=Math.max(ans,i);
        //         }
        //     }
        // }
        // if(ans==-1){return "";}
        // String str=String.valueOf(ans);
        // return str;
        if(sum<=0)return "";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;i++){
            int digit=Math.min(9,sum);
            sb.append(digit);
            sum-=digit;
        }
        if(sum==0)return sb.toString();
        return "";
    }
}