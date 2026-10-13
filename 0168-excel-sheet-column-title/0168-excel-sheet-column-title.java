class Solution {
    public String convertToTitle(int columnNumber) {
        HashMap<Integer,Character> map=new HashMap<>();
        for(int num=1;num<=26;num++){
            map.put(num,(char)('A'+num-1));
        }
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int ld=columnNumber%26;
            sb.append(map.get(ld+1));
            columnNumber/=26;
        }
        sb.reverse();
        String str=sb.toString();
        return str;
    }
}