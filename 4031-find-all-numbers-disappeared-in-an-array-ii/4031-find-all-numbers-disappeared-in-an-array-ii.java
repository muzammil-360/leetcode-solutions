class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int[] arr=new int[upper-lower+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=lower++;
        }
        Arrays.sort(nums);
        int a=0;
        int b=0;
        while(a<arr.length && b<nums.length){
            if(arr[a]==nums[b]){
                arr[a]=-1;
                a++;
                b++;
            }
            else if(arr[a]<nums[b]){a++;}
            else{b++;}
        }
        // for(int i=0;i<nums.length;i++){
        //     arr[nums[i]-1]=-1;
        // }
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i<n){
            while(i<n && arr[i]==-1){i++;}
            if(i==n){break;}
            int j=i;
            List<Integer> ls=new ArrayList<>();
            while(j<n && arr[j]!=-1){
                // List<Integer> ls=Arrays.asList(arr[j]);
                //ls.add(arr[j]);
                j++;
            }
            ls.add(arr[i]);
            ls.add(arr[j-1]);
            ans.add(ls);
            i=j;
        }
        return ans;
    }
}