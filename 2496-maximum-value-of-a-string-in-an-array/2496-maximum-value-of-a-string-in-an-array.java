class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            int val=check(str);
            max=Math.max(max,val);
        }
        return max;
    }
    public int check(String s){
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                return s.length();
            }
            i++;
        }
        return Integer.parseInt(s);
    }
}