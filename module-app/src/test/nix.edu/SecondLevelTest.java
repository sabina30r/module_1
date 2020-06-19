package nix.edu;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLevelTest {
    private static Lev2Util level2;
    @BeforeAll
    public static void configFirstLevel(){ level2 = new Lev2Util(); }

    @Test
    public void checkStringWithBracketsTest(){
        assertEquals("YES",level2.checkStringWithBrackets("[simple(text{example for} test ) method]"));
        assertEquals("NO", level2.checkStringWithBrackets("[invalid}{(example)} ] )"));
    }

    @Test
    public void findMaxDepthOfBinaryTreeTest(){
        BinaryTreeUtil tree = new BinaryTreeUtil();
        tree.root = new BinaryTreeUtil.TreeNode(1);
        tree.root.left = new BinaryTreeUtil.TreeNode(2);
        tree.root.right = new BinaryTreeUtil.TreeNode(3);
        tree.root.left.left = new BinaryTreeUtil.TreeNode(4);
        tree.root.right.left = new BinaryTreeUtil.TreeNode(5);
        tree.root.right.right = new BinaryTreeUtil.TreeNode(6);
        tree.root.right.right.left = new BinaryTreeUtil.TreeNode(8);
        tree.root.right.left.right = new BinaryTreeUtil.TreeNode(7);
        tree.root.right.right.left.left = new BinaryTreeUtil.TreeNode(14);

        assertEquals(5, tree.findMaxDepthOfBinaryTree(tree.root));
    }



}
