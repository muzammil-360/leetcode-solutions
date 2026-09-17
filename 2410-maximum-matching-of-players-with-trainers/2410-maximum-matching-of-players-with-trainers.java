class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        int cnt=0;
        while(i<players.length && j<trainers.length){
            while(players[i]>trainers[j]){
                if(j==trainers.length-1){break;}
                j++;
            }
            if(players[i]<=trainers[j]){
            cnt++;
            }
            i++;
            j++;
        }
        return cnt;
    }
}