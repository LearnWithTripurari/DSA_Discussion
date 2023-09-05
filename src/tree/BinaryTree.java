package tree;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    static TreeNode root = null;

    public static void main(String[] args) {

//      TreeNode n1  =  new TreeNode(1);
//      TreeNode n2  =  new TreeNode(2);
//      TreeNode n3  =  new TreeNode(3);
//      TreeNode n4  =  new TreeNode(4);
//
//
//      root = n1;
//      n1.left = n2;
//      n1.right = n3;
//      n2.left = n4;
//
//      System.out.println("Height of the Tree " + height(root));

      root = insert(root, 5);
      insert(root, 3);
      insert(root, 8);
      insert(root, 2);
      insert(root, 4);

      inorderTraversal(root);
        System.out.println();
      preorderTraversal(root);
        System.out.println();
        postorderTraversal(root);

    }

    static TreeNode insert(TreeNode node, int data) {

        if (node == null) {
            return  new TreeNode(data);
        }

        if (data < node.data) {
           node.left  = insert(node.left, data);
        }
        else if (data > node.data) {
           node.right  = insert(node.right, data);
        }

        return node;
    }

    static int height(TreeNode node) {

        if (node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }

    static void inorderTraversal(TreeNode node) {
        // Root, Left, Right
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    static void preorderTraversal(TreeNode node) {
        // Root, Left, Right

        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);

    }


    private static void postorderTraversal(TreeNode node) {

        // Left, Right, Root

        if (node == null) {
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }
}
