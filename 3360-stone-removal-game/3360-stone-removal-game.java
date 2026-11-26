class Solution {
    public boolean canAliceWin(int n) {
        int Max_removal=10;
        boolean flag=true;
        int temp=n;
        while(temp>=Max_removal){
            temp-=Max_removal;
            Max_removal--;
            flag=!flag;
        }
        return !flag;
    }
}