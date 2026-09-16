class Solution {
    public String reversePrefix(String s, int k) {
        // char[] rev=s.toCharArray();
        // for(int i=0;i<k;i++){
        // }
        // StringBuilder sb=new StringBuilder();
        // sb.append(s);
        char[] arr=s.toCharArray();
        int l=0;
        int r=k-1;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String ns=String.valueOf(arr);
        return ns;
        // int l=0;
        // int r=k-1;
        // while(l<r){
        //     char temp=sb.charAt(l);
        //     sb.charAt(l)=sb.charAt(r);
        //     sb.charAt(r)=temp;
        //     l++;
        //     r--;
        // }
     // return sb.toString();
    }
    //String rev(char[] arr ,int k){
        // int l=0;
        // int r=k-1;
        // while(l<r){
        //     char temp=arr[l];
        //     arr[l]=arr[r];
        //     arr[r]=temp;
        //     l++;
        //     r--;
        // }
    //}
}