class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            int low=0;
            int high=arr2.length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr1[i]-arr2[mid]>d){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            if(low==arr2.length || arr2[low]-arr1[i]>d){
                cnt++;
            }
        }
        return cnt;
    }
}