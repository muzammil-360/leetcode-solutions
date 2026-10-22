class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i==0){
            while(s.charAt(i)=='#'){
                i++;
            }
            }
            if(i==s.length())break;
            if(s.charAt(i)!='#'){sb1.append(s.charAt(i));}
            else{
                if(sb1.length()>0){
                sb1.deleteCharAt(sb1.length()-1);
                }
                }
            i++;
        }
        StringBuilder sb2=new StringBuilder();
        int j=0;
        while(j<t.length()){
            if(j==0){
            while(t.charAt(j)=='#'){
                j++;
            }
            }
            if(j==t.length())break;
            if(t.charAt(j)!='#'){sb2.append(t.charAt(j));}
            else{
                if(sb2.length()>0){
                sb2.deleteCharAt(sb2.length()-1);
                }
                }
            j++;
        }
        return sb1.toString().equals(sb2.toString());
    }
}