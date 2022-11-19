package Exercises;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeOrderLevelTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode leaf1 = new TreeNode(9);
        TreeNode treeNode = new TreeNode(20);
        TreeNode nullNode = null;
        TreeNode secondNull = null;
        TreeNode thirdLeaf = new TreeNode(15);
        TreeNode fourthLeaf = new TreeNode(7);
        root.left = leaf1;
        root.right = treeNode;
        treeNode.left = thirdLeaf;
        treeNode.right = fourthLeaf;
        System.out.println(root);
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> arr = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr == null) {
                if (queue.isEmpty() || queue.peek() == null) {
                    if (!arr.isEmpty()) result.add(arr);
                    return result;
                }
                queue.add(null);
                result.add(arr);
                arr = new ArrayList<>();
                continue;
            }
            arr.add(curr.val);
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
