class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !valid(arr[i])){i++;}
            while(i<j && !valid(arr[j])){j--;}
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
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
    boolean valid(char ch){
        if((ch>='a' && ch<='z' ) || (ch>='A'  && ch<='Z')){return true;}
        return false;
    }
}