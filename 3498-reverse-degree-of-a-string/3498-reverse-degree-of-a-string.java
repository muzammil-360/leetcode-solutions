class Solution {
    public int reverseDegree(String s) {
        int degree=0;
        for(int i=0;i<s.length();i++){
            int sum=0;
            sum=sum+(26-(s.charAt(i)-'a'))*(i+1);
            degree+=sum;
        }
        return degree;
    }
}