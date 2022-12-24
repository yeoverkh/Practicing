package Exercises;

import Exercises.models.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode leaf1 = new TreeNode(9);
        TreeNode treeNode = new TreeNode(20);
        TreeNode thirdLeaf = new TreeNode(15);
        TreeNode fourthLeaf = new TreeNode(7);
        root.left = leaf1;
        root.right = treeNode;
        treeNode.left = thirdLeaf;
        treeNode.right = fourthLeaf;
        System.out.println(root);
        System.out.println(lowestCommonAncestor(root, thirdLeaf, fourthLeaf));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
