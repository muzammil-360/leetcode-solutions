class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0)return true;
        int ld=num%10;
        if(ld==0)return false;
        return true;
    }
}