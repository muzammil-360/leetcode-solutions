class Solution {
    public String removeStars(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(i==0){
            while(s.charAt(i)=='*'){
                i++;
            }
            }
            if(i==s.length())break;
            if(s.charAt(i)!='*'){sb.append(s.charAt(i));}
            else{
                if(sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
                }
                }
            i++;
        }
        return sb.toString();
    }
}