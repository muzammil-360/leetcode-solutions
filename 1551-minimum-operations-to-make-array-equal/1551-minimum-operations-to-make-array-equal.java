class Solution {
    public int minOperations(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=2*i+1;
        }
        int sum=n;  //sum(n)/n-->n^2/n=n
        int addsum=0;
        int subsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=sum){
                addsum+=(sum-arr[i]);
            }
            else{
                subsum+=(arr[i]-sum);
            }
        }
        return Math.max(addsum,subsum);
    }
}