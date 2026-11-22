class Solution {
    public int compress(char[] chars) {
        String ans="";
        int i=0;
        while(i<chars.length){
            int cnt=1;
            while(i+1<chars.length && chars[i]==chars[i+1]){
                cnt++;
                i++;
            }
            if(cnt==1){ans=ans+chars[i];}
            else{ans=ans+chars[i]+String.valueOf(cnt);}
            i++;
        }
        for(int j=0;j<ans.length();j++){
            chars[j]=ans.charAt(j);
        }
        return ans.length();
    }
}