class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<=2)return false;
        int l=0;
        int r=n-1;
        while(l+1<n && arr[l]<arr[l+1])l++;
        while(r-1>0 && arr[r]<arr[r-1])r--;
        if(l==n-1)return false;
        return l==r;
    }
}