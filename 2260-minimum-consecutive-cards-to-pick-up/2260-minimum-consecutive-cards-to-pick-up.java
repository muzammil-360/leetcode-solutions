class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int ans=Integer.MAX_VALUE;
        while(r<cards.length){
            if(map.containsKey(cards[r])){
                ans=Math.min(ans,r-map.get(cards[r])+1);
            }
            map.put(cards[r],r);
            r++;
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}