class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int n = ans.size();
                ans.add(ans.get(n - 1) + ans.get(n - 2));
            }
            else if (operations[i].equals("D")) {
                int n = ans.size();
                ans.add(2 * ans.get(n - 1));
            }
            else if (operations[i].equals("C")) {
                ans.remove(ans.size() - 1);
            }
            else {
                ans.add(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for (int x : ans) {
            sum += x;
        }
        return sum;
    }
}