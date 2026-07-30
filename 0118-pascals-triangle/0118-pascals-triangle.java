class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
              List<Integer> temp=new ArrayList<>();
              long res=1;
              temp.add((int)res);
              for(int c=0;c<i;c++){
                res*=(i-c);
                res/=(c+1);
                temp.add((int)res);
              } 
              ans.add(temp);    
        }
        return ans;
    }
}