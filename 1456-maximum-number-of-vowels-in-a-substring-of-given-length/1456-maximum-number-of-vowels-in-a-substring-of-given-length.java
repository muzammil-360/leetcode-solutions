class Solution {
    public int maxVowels(String s, int k) {
        char[] arr=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        int cnt=0;
        for(int i=0;i<k;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){cnt++;}
            ans.append(arr[i]);
        }
        int maxcnt=cnt;
        for(int i=k;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){cnt++;}
            ans.append(arr[i]);
            if(arr[i-k]=='a' || arr[i-k]=='e' || arr[i-k]=='i' || arr[i-k]=='o' || arr[i-k]=='u'){cnt--;}
            ans.deleteCharAt(0);
            maxcnt=Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}