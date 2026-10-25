class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans=new int[n];
        int diff=n-k;
        for(int i=1;i<=diff;i++){
            ans[i-1]=i;
        }
        int[] ans1=new int[n-diff];
        for(int i=diff+1;i<=n;i++){
            ans1[i-(diff+1)]=i;
        }
        int ind=diff;
        int i=0;
        int j=ans1.length-1;
        while(i<=j){
            if(i!=j){
                ans[diff++]=ans1[j];
                ans[diff++]=ans1[i];
                i++;
                j--;
            }
            else{
                ans[diff++]=ans1[i];
                i++;
            }
        }
        return ans;
    }
}