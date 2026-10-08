class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] ans=new int[4];
        int ind=0;
        //int num=0;
        while(num1>0 && num2>0 && num3>0){
            int i=num1%10;
            int j=num2%10;
            int k=num3%10;
            num1/=10;
            num2/=10;
            num3/=10;
            int min=Math.min(i,Math.min(j,k));
           // num=num*10+min;
           ans[ind++]=min;
        }
        int m=0;
        int n=3;
        while(m<n){
            int temp=ans[m];
            ans[m]=ans[n];
            ans[n]=temp;
            m++;
            n--;
        }
         int num=0;
         for(int x:ans){
            num=num*10+x;
         }
         return num;
    }
}