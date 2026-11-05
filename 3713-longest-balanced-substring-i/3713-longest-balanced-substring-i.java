class Solution {
    public int longestBalanced(String s) {
        int len=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                if(check(freq)){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public boolean check(int[] arr){
        boolean flag=true;
        int val=0;
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                val=arr[i];
                break;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0 && arr[i]!=val){
                flag=false;
                break;
            }
        }
        return flag;
    }
}