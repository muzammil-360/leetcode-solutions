class Solution {
    public int getLucky(String s, int k) {
        // String num="";
        // for(char c:s.toCharArray()){
        //     num+=(c-'a'+1);
        // }
        // long ans=Integer.parseInt(num);
        // while(k>0){
        //     long temp=ans;
        //     long sum=0;
        //     while(temp>0){
        //     long ld=temp%10;
        //     sum+=ld;
        //     temp/=10;
        //     }
        //     ans=sum;
        //     k--;
        // }
        // return (int)ans;

        String num="";
        for(char c:s.toCharArray()){
            num+=(c-'a'+1);
        }
        int sum=0;
        while(k>0){
            sum=0;
            for(char c:num.toCharArray()){
            sum+=(c-'0');
        }
        num=String.valueOf(sum);
        k--;
        }
        return Integer.parseInt(num);
    }
}