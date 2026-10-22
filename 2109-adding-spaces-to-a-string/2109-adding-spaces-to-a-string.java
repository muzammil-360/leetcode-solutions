class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0,spaces[0]));
        int i=1;
        while(i<spaces.length){
            sb.append(" ");
            sb.append(s.substring(spaces[i-1],spaces[i]));
            i++;
        }
        sb.append(" ");
        sb.append(s.substring(spaces[i-1]));
        return sb.toString();
    }
}