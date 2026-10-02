class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;
        for(int num:nums){
            int temp=num;
            while(temp>0){
                int ld=temp%10;
                if(ld==digit){cnt++;}
                temp/=10;
            }
        }
        return cnt;
    }
}