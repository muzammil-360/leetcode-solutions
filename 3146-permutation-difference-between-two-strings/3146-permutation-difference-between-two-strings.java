class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] m=s.toCharArray();
        char[] n=t.toCharArray();
        int sum=0;
        int i=0;
        while(i<m.length){
            int j=0;
            while(j<n.length){
                if(m[i]==n[j]){
                    sum+=Math.abs(i-j);
                    //j++;
                    break;
                }
                else{j++;}
            }
            i++;
        }
        return sum;
    }
}