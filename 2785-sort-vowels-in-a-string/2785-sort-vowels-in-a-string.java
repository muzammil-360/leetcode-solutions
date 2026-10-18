class Solution {
    public String sortVowels(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(vowel(ch)){
                sb.append(ch);
            }
        }
        String v=sb.toString();
        char[] arr=v.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb1=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length()){
            if(vowel(s.charAt(i))){
                sb1.append(arr[j++]);
                i++;
            }
            else{
                sb1.append(s.charAt(i));
                i++;
            }
        }
        return new String(sb1);
    }
    boolean vowel(char s){
        if(s=='a' || s=='A' || s=='e' || s=='E' || s=='i' || s=='I' || s=='o' || s=='O' || s=='u' || s=='U'){
            return true;
        }
        return false;
    }
}