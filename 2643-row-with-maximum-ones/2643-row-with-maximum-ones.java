class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       // Arrays.sort(mat);
        // int ind=-1;
        // int count_ones=-1;
        // for(int i=0;i<mat.length;i++){
        //     int sumrow=0;
        //     for(int j=0;j<mat[0].length;j++){
        //         sumrow+=mat[i][j];
        //     }
        //     if(sumrow>count_ones){
        //         count_ones=sumrow;
        //         ind=i;
        //     }
        // }
        // return new int[]{ind,count_ones};

        int cnt_ones=0;
        int ind=0;
        for(int i=0;i<mat.length;i++){
            Arrays.sort(mat[i]);
            int ones=mat[i].length-lowerBound(mat[i],1);
            if(ones>cnt_ones){
                cnt_ones=ones;
                ind=i;
            }
        }
        return new int[]{ind,cnt_ones};
    }
     int lowerBound(int[] nums, int x) {
       int low=0;
       int high=nums.length-1;
       int ans=nums.length;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>=x){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return ans;
     }
}
