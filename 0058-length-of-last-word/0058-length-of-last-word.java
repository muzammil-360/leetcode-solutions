class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0)return 0;
        int ans=0;
        int i=s.length()-1;
        while(i>=0){

            if(i==s.length()-1){
                while(s.charAt(i)==' '){
                i--;
               // continue;
                }
                }
            if(i==-1)break;
            if(s.charAt(i)!=' ')ans++;
            else{break;}
            i--;
        }
        return ans;
    }
}