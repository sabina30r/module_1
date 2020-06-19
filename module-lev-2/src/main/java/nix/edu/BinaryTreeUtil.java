package nix.edu;

public class BinaryTreeUtil {
    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int val)
        {
            value = val;
        }
    }

    TreeNode root;

    int findMaxDepthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = findMaxDepthOfBinaryTree(root.left);
        int rightDepth = findMaxDepthOfBinaryTree(root.right);
        if (leftDepth > rightDepth)
            return (leftDepth + 1);
        else
            return (rightDepth + 1);
    }

}
