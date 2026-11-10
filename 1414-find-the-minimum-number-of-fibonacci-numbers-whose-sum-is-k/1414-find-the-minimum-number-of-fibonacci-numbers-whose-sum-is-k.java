class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        int i=0;
        int j=1;
        int n=1;
        while(n<=k){
            list.add(list.get(i)+list.get(j));
            n=list.get(i)+list.get(j);
            i++;
            j++;
        }
        int cnt=0;
        int temp=k;
        int ind=list.size()-1;
        while(temp>0){
            if(list.get(ind)<=temp){
                cnt++;
                temp-=list.get(ind);
            }
            ind--;
        }
        return cnt;
    }
}