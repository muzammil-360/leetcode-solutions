class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices%2!=0){return new ArrayList<>();}
        int x=(tomatoSlices/2)-cheeseSlices;
        if(x<0){return new ArrayList<>();}
        int y=cheeseSlices-x;
        if(y<0){return new ArrayList<>();}
        List<Integer> ans=new ArrayList<>();
        ans.add(x);
        ans.add(y);
        return ans;
    }
}