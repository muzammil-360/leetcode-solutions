class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans=new int[queries.length];
        int cnt=0;
        for(int i=0;i<queries.length;i++){
            int xj=queries[i][0];
            int yj=queries[i][1];
            int rj=queries[i][2];
            for(int j=0;j<points.length;j++){
                int xi=points[j][0];
                int yi=points[j][1];
                int dx=xj-xi;
                int dy=yj-yi;
                if((dx*dx+dy*dy)<=(rj*rj)){
                    //ans[i]++;
                    cnt++;
                }
            }
            ans[i]=cnt;
            cnt=0;
        }
        return ans;
    }
}