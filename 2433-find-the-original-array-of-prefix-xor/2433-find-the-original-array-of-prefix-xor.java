class Solution {
    public int[] findArray(int[] pref) {
        int[] prefxor=new int[pref.length];
        prefxor[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            prefxor[i]=pref[i-1]^pref[i];
        }
        return prefxor;
    }
}