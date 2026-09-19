class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        int i=1;
        while(i<num.length()-1){
            if(num.charAt(i-1)==num.charAt(i) && num.charAt(i)==num.charAt(i+1)){
              String str=num.substring(i-1,i+2);
              if(ans.equals("") || str.compareTo(ans)>0){
                ans=str;
              }
            }
            i++;
        }
        return ans;
    }
}