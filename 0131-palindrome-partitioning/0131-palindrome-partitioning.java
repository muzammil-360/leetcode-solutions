class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        solve(0,s,list,ans);
        return ans;
    }
    private void solve(int ind,String s,List<String> list,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(palindr(ind,i,s)){
                list.add(s.substring(ind,i+1));
                solve(i+1,s,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    private boolean palindr(int start,int end,String s){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){return false;}
        }
        return true;
    }
}