class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int i = 0;
        int j = mid;
        int cnt1 = 0;
        int cnt2 = 0;

        while (i < mid && j < n) {
            if (isVowel(s.charAt(i))) {
                cnt1++;
            }

            if (isVowel(s.charAt(j))) {
                cnt2++;
            }

            i++;
            j++;
        }

        return cnt1==cnt2;
    }
    public boolean isVowel(char ch) {
        return  (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
}