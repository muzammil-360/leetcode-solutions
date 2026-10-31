class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans=new int[A.length];
        int[] freq=new int[A.length+1];
        int total=0;
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){total++;}
            freq[B[i]]++;
            if(freq[B[i]]==2){total++;}
            ans[i]=total;
        }
        return ans;
    }
}