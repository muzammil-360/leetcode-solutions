class Solution {
    public double average(int[] salary) {
        if(salary.length==1)return 0;
        double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){max=(double)salary[i];}
            if(salary[i]<min){min=(double)salary[i];}
            sum+=(double)salary[i];
        }
        double ans=  (sum-max-min)/(double)(salary.length-2);
        return ans;
    }
}