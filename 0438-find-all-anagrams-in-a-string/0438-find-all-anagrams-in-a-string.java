class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length())return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<p.length();i++){
            freq2[p.charAt(i)-'a']++;
            freq1[s.charAt(i)-'a']++;
        }
        if(func(freq1,freq2)){ans.add(0);}
        for(int i=p.length();i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq1[s.charAt(i-p.length())-'a']--;
            if(func(freq1,freq2)){ans.add(i-p.length()+1);}
        }
        return ans;
    }
    public boolean func(int[] arr1,int[] arr2){
        int i=0;
        while(i<arr1.length){
            if(arr1[i]!=arr2[i])return false;
            i++;
        }
        return true;
    }
}