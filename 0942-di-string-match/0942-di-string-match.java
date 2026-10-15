class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int[] ans=new int[arr.length];
        int k=0;
        int i=0;
        int j=ans.length-1;
        int ind=0;
        while(ind<s.length()){
            if(i<ans.length && s.charAt(ind)=='I'){
                ans[k++]=arr[i];
                i++;
            }
            else if(j>=0 && s.charAt(ind)=='D'){
                ans[k++]=arr[j];
                j--;
            }
            ind++;
        }
        ans[k]=arr[i];
        return ans;
    }
}