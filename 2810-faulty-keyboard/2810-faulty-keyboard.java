class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                sb.append(s.charAt(i));
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
    // String reverse(String s){
    //     char[] arr=s.toCharArray();
    //     int i=0;
    //     int j=s.length()-1;
    //     while(i<j){
    //         char temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    //     return new String(arr);
    // }
}