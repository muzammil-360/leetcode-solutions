class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks);
        int i=processorTime.size()-1;
        int j=3;
        int ans=-1;
        while(i>=0){
            ans=Math.max(ans,(processorTime.get(i)+tasks.get(j)));
            i--;
            j+=4;
        }
        return ans;
    }
}