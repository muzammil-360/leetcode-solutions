class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int low=0;
            int high=potions.length-1;
            int ans=-1;
            while(low<=high){
               int  mid=low+(high-low)/2;
                if((long )potions[mid]*spells[i]>=success){
                    ans=mid;
                    high=mid-1;
                }
                else{low=mid+1;}
            }
            if(ans==-1)arr[i]=0;
            else{arr[i]=potions.length-ans;}

        }
        return arr;
    }
}