class Solution {
    public int[] sortArray(int[] nums) {
        // Arrays.sort(nums);
        // return nums;
        qs(nums,0,nums.length-1);
        return nums;
    }
    void qs(int[] nums,int low,int high){
        if(low<high){
            int pindex=func(nums,low,high);
            qs(nums,low,pindex-1);
            qs(nums,pindex+1,high);
        }
    }
    int func(int[] nums,int low,int high){
        int random = low + (int)(Math.random() * (high - low + 1));
        int temp1 = nums[low];
        nums[low] = nums[random];
        nums[random] = temp1;
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(nums[i]<=pivot && i<=high-1){i++;}
            while(nums[j]>pivot && j>=low+1){j--;}
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[low];
        nums[low]=nums[j];
        nums[j]=temp;
        return j;
    }
}