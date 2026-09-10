class Solution {
    public int firstUniqChar(String s) {
        for(int ch:s.toCharArray()){
            int fo=s.indexOf(ch);
            int lo=s.lastIndexOf(ch);
            if(fo-lo==0)return fo;
        }
        return -1;
    }
}