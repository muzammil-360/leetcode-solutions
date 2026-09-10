class Solution {
    public int percentageLetter(String s, char letter) {
        int cnt=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==letter)cnt++;
        }
        int p=(cnt*100)/arr.length;
        return p;
    }
}