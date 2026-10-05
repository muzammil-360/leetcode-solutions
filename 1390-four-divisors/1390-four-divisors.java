class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int cnt=0;
            int sum1=0;
            for(int j=1;j*j<=temp;j++){
                if(temp%j==0){
                    cnt++;
                    sum1+=j;
                    if((temp/j)!=j){
                        cnt++;
                        sum1+=(temp/j);
                    }
                }
               // if(cnt==4){sum+=sum1;}
            }
            if(cnt==4){sum+=sum1;}
        }
        return sum;
    }
}