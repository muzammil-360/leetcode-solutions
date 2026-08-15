class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans=new double[2];
        int i=0;
        double kelvin=celsius+273.15;
        ans[i++]=kelvin;
        double Fahrenheit = celsius * 1.80 + 32.00;
        ans[i]=Fahrenheit;
        return ans;
    }
}