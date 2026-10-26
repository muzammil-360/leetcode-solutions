class Solution {
    public int splitNum(int num) {
        List<Integer> ls=new ArrayList<>();
        while(num>0){
            int ld=num%10;
            ls.add(ld);
            num/=10;
        }
        Collections.sort(ls);
        int num1=0;
        int num2=0;
        int i=0;
        while(i<ls.size()){
            num1=num1*10+ls.get(i);
            i++;
            if(i<ls.size()){
            num2=num2*10+ls.get(i);
            i++;
            }
        }
        return num1+num2;
    }
}