class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<=k){return s;}
        String str=s;
        while(str.length()>k){
            str=func(str,k);
        }
        return str;
    }

    public String func(String str,int k){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int v=k;
            int sum=0;
            while(i<str.length() && v>0){
                sum+=str.charAt(i)-'0';
                i++;
                v--;
            }
            sb.append(sum);
        }
        return sb.toString();
    }
}