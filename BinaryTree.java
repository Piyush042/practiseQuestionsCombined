class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree{
    private TreeNode root;

    // Constructor to initialize the BinaryTree
    public BinaryTree() {
        root = null;
    }

    // Method to insert a value into the binary tree
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Helper method to insert a value recursively
    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }
        return node;
    }

    // Method to perform inorder traversal of the binary tree
    public void inorderTraversal() {
        inorderRecursive(root);
    }

    // Helper method to perform inorder traversal recursively
    private void inorderRecursive(TreeNode node) {
        if (node != null) {
            inorderRecursive(node.left);
            System.out.print(node.value + " ");
            inorderRecursive(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("Inorder traversal:");
        tree.inorderTraversal();
    }
}