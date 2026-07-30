class Solution {

    public int minimumPushes(String word) {
        return solve(0, word.length());
    }

    private int solve(int idx, int n) {
        if (idx == n) {
            return 0;
        }

        int pushesForCurrent = (idx / 8) + 1;

        return pushesForCurrent + solve(idx + 1, n);
    }
}