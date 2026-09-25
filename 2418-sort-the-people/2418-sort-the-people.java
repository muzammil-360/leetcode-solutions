class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] str=new String[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            str[heights.length-1-i]=map.get(heights[i]);
        }
        return str;
    }
}