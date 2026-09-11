class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        while(true){
        int temp=n;
        sum=0;
        if(!set.contains(temp)){
            set.add(temp);
        }
        else{
            break;
        }
        while(temp>0){
            int ld=temp%10;
            sum+=ld*ld;
            temp/=10;
        }
        if(sum==1){
            return true;
            }
            n=sum;
            }
        return false;
    }
}