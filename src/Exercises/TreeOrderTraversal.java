package Exercises;

import Exercises.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode leaf1 = new TreeNode(9);
        TreeNode treeNode = new TreeNode(20);
        TreeNode thirdLeaf = new TreeNode(15);
        TreeNode fourthLeaf = new TreeNode(7);
        root.right = treeNode;
        root.left = leaf1;
        treeNode.left = thirdLeaf;
        treeNode.right = fourthLeaf;
        System.out.println(root);
        System.out.println(orderTraversal(root));
    }

    public static List<Integer> orderTraversal(TreeNode root) {
        if (root == null) return null;
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current == null) continue;
            result.add(current.val);
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return result;
    }
}
