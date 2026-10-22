class Solution {
    public int candy(int[] ratings) {
        int[] pre=new int[ratings.length];
        pre[0]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){pre[i]=pre[i-1]+1;}
            else{
                pre[i]=1;
            }
        }
        int[] suf=new int[ratings.length];
        suf[ratings.length-1]=1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){suf[i]=suf[i+1]+1;}
            else{
                suf[i]=1;
            }
        }
        int candies=0;
        for(int i=0;i<ratings.length;i++){
            candies+=Math.max(pre[i],suf[i]);
        }
        return candies;
    }
}