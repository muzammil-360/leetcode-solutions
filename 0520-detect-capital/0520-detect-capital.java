class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        int f=0;
        for(int ch=0;ch<word.length();ch++){
            char c=word.charAt(ch);
            int num=c-'0';
            // if(ch==0 && num<45){f=1;}
            // if(num<45)cnt++;
            if(ch==0 && c>='A' && c<='Z'){f=1;}
            if(c>='A' && c<='Z')cnt++;

        }
        if(cnt==word.length())return true;
        if(cnt==0)return true;
        if(cnt==1 && f==1)return true;
        return false;
    }
}