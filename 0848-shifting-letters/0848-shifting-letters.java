class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int sum=0;
        char[] arr=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            sum=(sum+shifts[i])%26;
            arr[i]=(char)((arr[i]-'a'+sum)%26+'a');
        }
        // String str=arr.toString();
        // return str;
        return new String(arr);
    }
}