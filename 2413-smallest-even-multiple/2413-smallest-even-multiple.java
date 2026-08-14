class Solution {
    public int smallestEvenMultiple(int n) {
        int temp=n;
        while(temp>0){
        if(temp%n==0 && temp%2==0){break;}
        else{temp++;}
        }
        return temp;
    }
}