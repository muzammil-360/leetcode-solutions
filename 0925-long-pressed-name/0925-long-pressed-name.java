class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] n=name.toCharArray();
        char[] t=typed.toCharArray();
        int i=0;
        int j=0;
        while(i<n.length && j<t.length){
            if(n[i]!=t[j])return false;
            while( j+1<t.length && t[j]==t[j+1] &&  (i + 1 >= n.length || n[i + 1] != t[j])){
                j++;
                }
            i++;
            j++;
        }
         return i == n.length && j == t.length;
    }
}