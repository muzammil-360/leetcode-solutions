class Solution {
    public int reverse(int x) {
        int rev_digit=0;
        while(x!=0){
            int ld=x%10;
            x/=10;
            if(rev_digit>(Integer.MAX_VALUE/10) || (rev_digit==(Integer.MAX_VALUE/10) && ld>7))return 0;
            if(rev_digit<(Integer.MIN_VALUE/10) || (rev_digit==(Integer.MAX_VALUE/10) && ld<-8))return 0;
            rev_digit=rev_digit*10+ld;
        }
        return rev_digit;
    }
}