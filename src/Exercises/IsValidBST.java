package Exercises;

import Exercises.models.TreeNode;

public class IsValidBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode leftNode = new TreeNode(1);
        TreeNode rightNode = new TreeNode(7);
        root.left = leftNode;
        root.right = rightNode;
        rightNode.left = new TreeNode(6);
        rightNode.right = new TreeNode(8);
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }
}
