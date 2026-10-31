class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map1=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
        }
        HashMap<String,Integer> map2=new HashMap<>();
        for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
        }
        List<String> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(String str:list1){
            if(map1.containsKey(str) && map2.containsKey(str)){
                int val=map1.get(str)+map2.get(str);
                if(val==min){
                    list.add(str);
                }
                else if(val<min){
                    list.clear();
                    list.add(str);
                    min=val;
                }
            }
        }
        String[] ans=new String[list.size()];
        int ind=0;
        for(String str:list){
            ans[ind++]=str;
        }
        return ans;
    }
}