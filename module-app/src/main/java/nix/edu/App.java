package nix.edu;

public class App {
    public static void main(String[] args) {

        int[] arr = {1,4,5,1,1,3};
        String stringForTask1 = "{module( of nix ) educational} [program]";
        BinaryTreeUtil tree = new BinaryTreeUtil();

        tree.root = new BinaryTreeUtil.TreeNode(1);
        tree.root.left = new BinaryTreeUtil.TreeNode(2);
        tree.root.right = new BinaryTreeUtil.TreeNode(3);
        tree.root.left.left = new BinaryTreeUtil.TreeNode(4);
        tree.root.right.left = new BinaryTreeUtil.TreeNode(5);
        tree.root.right.right = new BinaryTreeUtil.TreeNode(6);
        tree.root.right.right.left = new BinaryTreeUtil.TreeNode(8);
        tree.root.right.left.right = new BinaryTreeUtil.TreeNode(7);

        Lev1Util lev1Util = new Lev1Util();
        Lev2Util lev2Util = new Lev2Util();

        System.out.println("Level 1");
        System.out.print("Number of unique digits: ");
        lev1Util.countArrayUniqueDigits(arr);

        System.out.print("Check possibility of horse move: ");
        lev1Util.checkHorseMove(1,1,2,2);

        System.out.print("Triangle's square: ");
        lev1Util.findTriangleSquare(1,2,5,1,5,3);
        System.out.println();

        System.out.println("Level 2");
        System.out.print("Is input string correct? : ");
        lev2Util.checkStringWithBrackets(stringForTask1);
        System.out.println("Max depth of binary tree: " + tree.findMaxDepthOfBinaryTree(tree.root));

    }
}
