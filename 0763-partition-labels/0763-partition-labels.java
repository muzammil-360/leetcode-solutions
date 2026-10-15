class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int part=0;
        int ind=-1;
        while(i<s.length()){
            ind=Math.max(ind,map.get(s.charAt(i)));
            if(ind==i){
               // int val=ind+1-p;
                ans.add((ind+1)-part);
                part=ind+1;
            }
            i++;
        } 
        return ans;
    }
}