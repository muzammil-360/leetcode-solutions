class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set=new HashSet<>();
        for(char ch:password.toCharArray()){
            set.add(ch);
        }
        int sum=0;
        for(char ch:set){
            if(ch>='a' && ch<='z'){sum+=1;}
            if(ch>='A' && ch<='Z'){sum+=2;}
            if(ch>='0' && ch<='9'){sum+=3;}
            if(ch=='!' || ch=='@'|| ch=='#' || ch=='$'){sum+=5;}
        }
        return sum;
    }
}