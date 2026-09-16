class Solution {
    public int firstMatchingIndex(String s) {
      //  char[] arr=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r))return l;
            l++;
            r--;
        }
        return -1;
    }
}