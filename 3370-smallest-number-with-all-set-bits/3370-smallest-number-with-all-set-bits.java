class Solution {
    public int smallestNumber(int n) {
        int p2=2;
        for(int i=1;i<n;i++){
            if(p2>n){break;}
            p2*=2;
        }
        return p2-1;
    }
}