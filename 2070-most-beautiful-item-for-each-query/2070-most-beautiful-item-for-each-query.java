class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {

        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        int n = items.length;

        int[] prefixMax = new int[n];
        prefixMax[0] = items[0][1];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], items[i][1]);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int ind = -1;
            int low = 0;
            int high = n - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (items[mid][0] <= queries[i]) {
                    ind = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            ans[i] = (ind == -1) ? 0 : prefixMax[ind];
        }

        return ans;
    }
}