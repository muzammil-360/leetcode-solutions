class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length=m+n;
        int gap=(length/2)+(length%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<length){
                if(left<m && right>=m){
                    swap(nums1,nums2,left,right-m);
                }
                else if(left>=m){
                     swap(nums2,nums2,left-m,right-m);
                }
                else{
                     swap(nums1,nums1,left,right);
                }
                left++;
                right++;
            }
            if(gap==1){break;}
             gap=(gap/2)+(gap%2);
        }
           for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
    void swap(int[] nums1,int[] nums2,int i,int j){
        if(nums1[i]>nums2[j]){
            int temp=nums1[i];
            nums1[i]=nums2[j];
            nums2[j]=temp;
        }
    }
}