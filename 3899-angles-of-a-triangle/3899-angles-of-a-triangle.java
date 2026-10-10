class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        int a=sides[0];
        int b=sides[1];
        int c=sides[2];
        if(a+b<=c)return new double[]{};
        double[] ans=new double[3];
        double cosA=(Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(b*c*(2.0));
        double A=Math.toDegrees(Math.acos(cosA));
        ans[0]=A;
        double cosB=(Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(a*c*(2.0));
        double B=Math.toDegrees(Math.acos(cosB));
        ans[1]=B;
        ans[2]=180-(A+B);
        Arrays.sort(ans);
        return ans;
    }
}