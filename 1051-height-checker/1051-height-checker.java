class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;  
        int[] expected=new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        int m=expected.length;
        int i=0;
        int j=0;
        int cnt=0;
        while(i<n &&j<m){
            if(heights[i]!=expected[j]){
                cnt++;
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return cnt;
    }
}