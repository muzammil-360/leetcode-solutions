class Solution {
    public String reverseStr(String s, int k) {
        if(s.length()<=k)return reverse(s);
        String str="";
        int i=0;
        while(i<s.length()){
            int end=Math.min(i+k,s.length());
            str+=reverse(s.substring(i,end));
            int next=Math.min(i+2*k,s.length());
            if(end<next){
                str+=s.substring(end,next);
            }
            i+=2*k;
        }
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