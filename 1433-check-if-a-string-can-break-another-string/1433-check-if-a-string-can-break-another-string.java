class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr2);
        boolean b1=true;
        boolean b2=true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<arr2[i]){
                b1=false;
            }
            if(arr1[i]>arr2[i]){
                b2=false;
            }
        }
        if(b1==true || b2==true)return true;
        return false;
    }
}