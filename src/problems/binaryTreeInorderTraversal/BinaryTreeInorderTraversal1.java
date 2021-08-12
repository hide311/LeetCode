package problems.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal1 implements BinaryTreeInorderTraversal {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        if (root == null) {
            return inorderList;
        }
        doSomething(root, inorderList);
        return inorderList;
    }

    private void doSomething(TreeNode treeNode, List<Integer> inorderList) {
        if (treeNode.left != null) {
            doSomething(treeNode.left, inorderList);
        }
        inorderList.add(treeNode.val);
        if (treeNode.right != null) {
            doSomething(treeNode.right, inorderList);
        }
    }
}