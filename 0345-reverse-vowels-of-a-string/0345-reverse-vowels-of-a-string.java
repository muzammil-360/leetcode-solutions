class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(i<j && !vowel(arr[i])){i++;}
            while(j>i && !vowel(arr[j])){j--;}
            if(i>j)break;
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    boolean vowel(char s){
        if(s=='a' || s=='A' || s=='e' || s=='E' || s=='i' || s=='I' || s=='o' || s=='O' || s=='u' || s=='U'){
            return true;
        }
        return false;
    }
}