class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans=new ArrayList<>();
        for(char ch=s.charAt(0);ch<=s.charAt(3);ch++){
            for(int num=s.charAt(1)-'0';num<=s.charAt(4)-'0';num++){
                String str=""+ch+num;
                ans.add(str);
            }
        }
        return ans;
    }
}