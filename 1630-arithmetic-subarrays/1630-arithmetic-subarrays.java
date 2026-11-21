class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>();
        int i=0;
        while(i<l.length){
            int start=l[i];
            int end=r[i];
            int[] arr=new int[end-start+1];
            for(int j=start;j<=end;j++){
                arr[j-start]=nums[j];
            }
            Arrays.sort(arr);
            boolean flag=true;
            for(int j=1;j<arr.length-1;j++){
                if(2*arr[j]!=arr[j+1]+arr[j-1]){flag=false;}
            }
            ans.add(flag);
            i++;
        }
        return ans;
    }
}