class Solution {
    public boolean areNumbersAscending(String s) {
        int first=0;
        int i=0;
        while(i<s.length()){
            String str="";
            while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                str+=s.charAt(i);
                i++;
            }
            if(str.length()>0){
            if(first==0){first=Integer.parseInt(str);}
            else{
                if(first<(Integer.parseInt(str))){first=Integer.parseInt(str);}
                else{return false;}
            }
            }
            i++;
        }
        return true;
    }
}