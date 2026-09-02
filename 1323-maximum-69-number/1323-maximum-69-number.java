class Solution {
    public int maximum69Number (int num) {
       List<Integer> ls=new ArrayList<>();
        while(num>0){
            int ld=num%10;
            ls.add(ld);
            num/=10;
        }
        Collections.reverse(ls);
        int[] arr=new int[ls.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ls.get(i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        int sol=0;
        for(int i=0;i<arr.length;i++){
            sol=sol*10+arr[i];
        }
        return sol;
    }
}