class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            int temp=i;
            List<Integer> ls=new ArrayList<>();
            while(temp>0){
                int ld=temp%10;
                ls.add(ld);
                temp/=10;
            }
            Collections.reverse(ls);
            int waviness=0;
            for(int j=1;j<ls.size()-1;j++){
                if((ls.get(j)>ls.get(j-1) && ls.get(j)>ls.get(j+1)) ||  (ls.get(j)<ls.get(j-1) && ls.get(j)<ls.get(j+1))){
                    waviness++;
                }
            }
            ans+=waviness;
        }
        return ans;
    }
}