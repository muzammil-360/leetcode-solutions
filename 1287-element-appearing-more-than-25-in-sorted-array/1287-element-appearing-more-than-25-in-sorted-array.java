class Solution {
    public int findSpecialInteger(int[] arr) {
      int i=0;
      int max=-1;
      int ans=0;
      while(i<arr.length){
        int cnt=1;
        while(i+1<arr.length && arr[i]==arr[i+1]){cnt++;i++;}
        if(cnt>max){
            max=cnt;
            ans=arr[i];
        }
        i++;
      }
      return ans;
    }
}