class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ind=-1;
        int count_ones=-1;
        for(int i=0;i<mat.length;i++){
            int sumrow=0;
            for(int j=0;j<mat[0].length;j++){
                sumrow+=mat[i][j];
            }
            if(sumrow>count_ones){
                count_ones=sumrow;
                ind=i;
            }
        }
        return new int[]{ind,count_ones};
    }
}