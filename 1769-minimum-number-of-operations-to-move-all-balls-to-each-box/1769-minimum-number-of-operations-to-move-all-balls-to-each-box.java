class Solution {
    public int[] minOperations(String boxes) {
        char[] ch=boxes.toCharArray();
        int[] ans=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            int sum=0;
            for(int j=0;j<ch.length;j++){
                if(ch[j]=='1'){
                    sum+=Math.abs(i-j);
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}