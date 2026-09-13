class Solution {
    public String replaceDigits(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i%2==1){
              arr[i]=(char)((arr[i-1]-'a'+(arr[i]-'0'))%26+'a');
            }
            }
        return new String(arr);
    }
}