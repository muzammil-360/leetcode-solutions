class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int[] last = new int[10];
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - '0'] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int d = 9; d > s.charAt(i) - '0'; d--) {
                if (last[d] > i) {
                    char[] arr = s.toCharArray();
                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }
        return num;
    }
}