class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfre=0;
        int[] hash=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxfre=Math.max(maxfre,hash[s.charAt(r)-'A']);
            // while((r-l+1)-maxfre>k)
            if((r-l+1)-maxfre>k)
            {
                hash[s.charAt(l)-'A']--;
                // maxfre=0;
                // for(int p=0;p<26;p++){
                //     maxfre=Math.max(maxfre,hash[p]);
                // }
                l++;
            }
            if((r-l+1)-maxfre<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;        
    }
}