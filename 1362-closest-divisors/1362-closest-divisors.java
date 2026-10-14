class Solution {
    public int[] closestDivisors(int num) {
        int numo=num+1;
        List<Integer> ls1=new ArrayList<>();
        for(int i=1;i*i<=numo;i++){
            if(numo%i==0){
                ls1.add(i);
                if((numo/i)!=i){
                    ls1.add(numo/i);
                }
            }
        }
        Collections.sort(ls1);
        int numt=num+2;
        List<Integer> ls2=new ArrayList<>();
        for(int i=1;i*i<=numt;i++){
            if(numt%i==0){
                ls2.add(i);
                if((numt/i)!=i){
                    ls2.add(numt/i);
                }
            }
        }
        Collections.sort(ls2);
        int m=0;
        int n=ls1.size()-1;
        int ind1=0;
        int ind2=0;
        int diff1=Integer.MAX_VALUE;
        while(m<=n){
            if(ls1.get(m)*ls1.get(n)>numo){
                n--;
            }
            else if(ls1.get(m)*ls1.get(n)<numo){
                m++;
            }
            else{
                int val1=Math.abs(ls1.get(m)-ls1.get(n));
                if(val1<diff1){
                    diff1=val1;
                    ind1=m;
                    ind2=n;
                }
                m++;
                n--;
            }
        }


        int x=0;
        int y=ls2.size()-1;
        int ind3=0;
        int ind4=0;
        int diff2=Integer.MAX_VALUE;
        while(x<=y){
            if(ls2.get(x)*ls2.get(y)>numt){
                y--;
            }
            else if(ls2.get(x)*ls2.get(y)<numt){
                x++;
            }
            else{
                int val2=Math.abs(ls2.get(x)-ls2.get(y));
                if(val2<diff2){
                    diff2=val2;
                    ind3=x;
                    ind4=y;
                }
                x++;
                y--;
            }
            }
        // int ans1=Math.abs(ls1.get(ind1)-ls1.get(ind2));
        // int ans2=Math.abs(ls2.get(ind3)-ls2.get(ind4));
        if(diff1<diff2)return new int[]{ls1.get(ind1),ls1.get(ind2)};
        return new int[]{ls2.get(ind3),ls2.get(ind4)}; 
    }
}