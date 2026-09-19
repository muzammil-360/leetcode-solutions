class Solution {
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        int i=ch.length-1;
        while(i>=0){
            while(i>=0 && ch[i]==' '){i--;}
            if(i==-1)break;
            StringBuilder ss=new StringBuilder();
            while(i>=0 && ch[i]!=' '){
                ss.append(ch[i]);
                i--;
            }
            ss.reverse();
            if(ans.length()>0){ans=ans.append(" ").append(ss);}
            else{ans=ans.append(ss);}
        }
        String str=ans.toString();
        return str;
    }
}