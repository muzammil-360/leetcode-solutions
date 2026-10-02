class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String s:details){
            int val=Integer.parseInt(s.substring(11,13));
            if(val>60)cnt++;
        }
        return cnt;
    }
}