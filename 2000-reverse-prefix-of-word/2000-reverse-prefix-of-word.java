class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
        int l=0;
        int r=i;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        break;
            }
        }
        // int l=0;
        // int r=k-1;
        // while(l<r){
        //     char temp=arr[l];
        //     arr[l]=arr[r];
        //     arr[r]=temp;
        //     l++;
        //     r--;
        // }
         String ns=String.valueOf(arr);
        return ns;
    }
}