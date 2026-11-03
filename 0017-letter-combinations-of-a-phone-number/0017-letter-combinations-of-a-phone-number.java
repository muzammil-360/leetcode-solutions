class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits==null || digits.length()==0){return ans;}
        StringBuilder sb=new StringBuilder();
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        solve(0,digits,map,sb,ans);
        return ans;
    }
    private void solve(int ind,String digits,HashMap<Character,String> map,StringBuilder sb,List<String> ans){
        if(ind==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String str=map.get(digits.charAt(ind));
        for(char ch:str.toCharArray()){
            sb.append(ch);
            solve(ind+1,digits,map,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}