class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
      
        int x1=p1[0];
        int y1=p1[1];

        int x2=p2[0];
        int y2=p2[1];

        int x3=p3[0];
        int y3=p3[1];

        int x4=p4[0];
        int y4=p4[1];

        double dp1p3=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        double dp1p2=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double dp2p4=Math.sqrt(Math.pow(x4-x2,2)+Math.pow(y4-y2,2));
        double dp3p4=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        double dp1p4=Math.sqrt(Math.pow(x4-x1,2)+Math.pow(y4-y1,2));
        double dp2p3=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));

        if(dp1p3==0 || dp1p2==0 || dp1p4==0 || dp2p4==0 || dp3p4==0 || dp2p3==0 )return false;

        HashSet<Double> ans=new HashSet<>();
        ans.add(dp1p3);
        ans.add(dp1p2);
        ans.add(dp2p4);
        ans.add(dp3p4);
        ans.add(dp1p4);
        ans.add(dp2p3);
        if(ans.size()==2)return true;
        return false;
    }
}