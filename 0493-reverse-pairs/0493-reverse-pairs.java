class Solution {
    public int reversePairs(int[] nums) {
        return merge_sort(nums,0,nums.length-1);
        
    }
    int merge_sort(int[] nums,int low,int high){
        int cnt=0;
        if(low>=high){return cnt;}
        int mid=low+(high-low)/2;
        cnt+=merge_sort(nums,low,mid);
        cnt+=merge_sort(nums,mid+1,high);
        cnt+=reverse_pair(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
    void merge(int[] nums,int low,int mid,int high){
        List<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left]);
            left++;
        }
        while(right<=high){
            list.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }
    }
    int reverse_pair(int[] nums,int low,int mid,int high){
        int right=mid+1;
        int cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)nums[i]>2L*nums[right]){right++;}
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
}