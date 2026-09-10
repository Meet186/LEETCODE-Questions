

class Solution {
    int result;

    private Pair<Integer, Integer> solve(TreeNode root) {
        if (root == null) {
            return new Pair<>(0, 0);
        }

        Pair<Integer, Integer> left = solve(root.left);
        Pair<Integer, Integer> right = solve(root.right);

        int leftSum = left.getKey();
        int leftCount = left.getValue();

        int rightSum = right.getKey();
        int rightCount = right.getValue();

        int sum = leftSum + rightSum + root.val;
        int count = leftCount + rightCount + 1;

        // Check if root.val == average of subtree
        if (root.val == sum / count) {
            result++;
        }

        return new Pair<>(sum, count);
    }

    public int averageOfSubtree(TreeNode root) {
        result = 0;
        solve(root);
        return result;
    }
}
