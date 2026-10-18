class Solution {
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            while(i<ch.length && ch[i]==' '){i++;}
            if(i==ch.length)break;
            StringBuilder ss=new StringBuilder();
            while(i<ch.length && ch[i]!=' '){
                ss.append(ch[i]);
                i++;
            }
            ss.reverse();
            if(ans.length()>0){ans=ans.append(" ").append(ss);}
            else{ans=ans.append(ss);}
        }
        String str=ans.toString();
        return str;
    }
        String reverse(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}