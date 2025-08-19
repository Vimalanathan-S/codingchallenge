class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricSubTree(root.left, root.right);
    }
    private boolean isSymmetricSubTree(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val == right.val) {
            return isSymmetricSubTree(left.left, right.right) && isSymmetricSubTree(left.right, right.left);
        }

        return false;
    }
}
