class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<=2)return false;
        // int l=0;
        // int r=n-1;
        // while(l+1<n && arr[l]<arr[l+1])l++;
        // while(r-1>0 && arr[r]<arr[r-1])r--;
        // if(l==n-1)return false;
        // return l==r;
        int i=0;
        while(i+1<n && arr[i]<arr[i+1])i++;
        if(i==0 || i==n-1)return false;
        while(i+1<n && arr[i]>arr[i+1])i++;
        if(i!=n-1)return false;
        return true;
        
    }
}