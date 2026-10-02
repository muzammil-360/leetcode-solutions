class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        // int[] arr=new int[nums.length];
        // int i=0;
        // int cnt=0;
        // while(i<nums.length){
        //     if(nums[i]==x){
        //         cnt++;
        //         arr[i]=cnt;
        //     }
        //     else{
        //         arr[i]=cnt;
        //     }
        //     i++;
        // }
        // int[] ans=new int[queries.length];
        // for(int j=0;j<ans.length;j++){
        //     int q=queries[j];
        //     ans[j]=-1;
        //     for(int k=0;k<nums.length;k++){
        //         if(q==arr[k]){
        //             ans[j]=k;
        //             break;
        //         }
        //     }
        // }
        // int max=arr[arr.length-1];
        // for(int j=0;j<ans.length;j++){
        //     if(queries[j]>max){ans[j]=-1;}
        //     for(int k=0;k<nums.length;k++){
        //         if(queries[j]==arr[k]){
        //             ans[j]=k;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        int[] pos=new int[nums.length];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                pos[cnt]=i;
                cnt++;
            }
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<ans.length;i++){
            int q=queries[i];
            if(q>cnt){ans[i]=-1;}
            else{
                ans[i]=pos[q-1];
            }
        }
        return ans;

    }
}