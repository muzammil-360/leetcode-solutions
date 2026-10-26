class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:num.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++){
            if(map.getOrDefault((char)('0'+i),0)!=(num.charAt(i)-'0')){return false;}
        }
        return true;
    }
}