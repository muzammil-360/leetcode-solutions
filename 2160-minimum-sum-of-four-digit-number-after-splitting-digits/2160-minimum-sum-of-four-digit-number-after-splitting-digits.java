class Solution {
    public int minimumSum(int num) {
        int[] arr=new int[4];
        int i=0;
        while(num>0){
            int ld=num%10;
            arr[i++]=ld;
            num/=10;
        }
        Arrays.sort(arr);
        int n=0;
        int m=3;
        int sum=0;
        while(n<m){
            int x=arr[n]*10+arr[m];
            sum+=x;
            n++;m--;
        }
        return sum;
    }
}