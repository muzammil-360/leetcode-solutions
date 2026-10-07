class Solution {
    public int[] sumZero(int n) {
        // if(n==1)return new int[]{0};
        // List<Integer> ls =new ArrayList<>();
        // int i=1;
        // while(ls.size()<n){
        //     if(i==1 && n%2==1){
        //         ls.add(0);
        //     }
        //     ls.add(i);
        //     ls.add(-i);
        //     i++;
        // }
        // int[] ans=new int[n];
        // for(int j=0;j<ls.size();j++){
        //     ans[j]=ls.get(j);
        // }
        // return ans;
        int[] arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= i*2 - n+1;
        }
        return arr;
    }
}