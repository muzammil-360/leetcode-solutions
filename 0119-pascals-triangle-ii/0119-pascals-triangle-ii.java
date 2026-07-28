class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<Integer>  ans=new ArrayList<>();
       long res=1;
      ans.add((int)res);
      for(int i=0;i<rowIndex;i++){
        res*=(rowIndex-i);
        res/=(i+1);
        ans.add((int)res);
      }
       return ans;
    }
}