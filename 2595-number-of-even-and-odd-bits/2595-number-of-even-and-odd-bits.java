class Solution {
    public int[] evenOddBit(int n) {
        List<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%2);
            n/=2;
        }
        //Collections.reverse(list);
        int[] ans=new int[2];
        int even=0;
        int odd=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
                if(i%2==0){even++;}
                else{odd++;}
            }
        }
        ans[0]=even;
        ans[1]=odd;
        return ans;
        }
    }