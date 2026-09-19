class Solution {
    public int maxDepth(String s) {
        int cnt=0;
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){cnt--;}
            if(s.charAt(i)=='('){cnt++;}
            maxdepth=Math.max(maxdepth,cnt);
        }
        return maxdepth;
    }
}