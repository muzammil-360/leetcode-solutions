class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> min=new ArrayList<>();
        List<Integer> max=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            int mini=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<mini){
                    mini=Math.min(mini,matrix[i][j]);
                }
            }
            min.add(mini);
        }
        for(int i=0;i<matrix[0].length;i++){
            int maxi=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>maxi){
                    maxi=Math.max(maxi,matrix[j][i]);
                }
            }
            max.add(maxi);
        }
        HashSet<Integer> set1=new HashSet<>();
        for(int num:min){
            set1.add(num);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int num:max){
            if(set1.contains(num)){
             ans.add(num);   
            }
            set2.add(num);
        }
        return ans;
    }
}