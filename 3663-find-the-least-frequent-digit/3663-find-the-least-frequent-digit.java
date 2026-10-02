class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr=new int[10];
        while(n>0){
            int ld=n%10;
            arr[ld]+=1;
            n/=10;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){arr[i]=100;}
        }
        int min=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<min){min=num;}
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){return i;}
        }
        return -1;
    }
}