import javax.swing.tree.TreeCellRenderer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BfsBinaryTree extends TreeNode {
    public BfsBinaryTree(int val) {
        super(val);
    }


    static TreeNode insert(int val,TreeNode root){
        if(root == null)return new TreeNode(val);
        else if(root.value>val){
            root.left = insert(val,root.left);
        } else if (root.value<val) {
            root.right = insert(val, root.right);
        }
        return root;
    }
    static boolean binarySearch(int key , TreeNode root){
        if(root == null)return false;
        if(root.value == key)return true;
        else if (root.value<key) {
            return binarySearch(key,root.right);
        }
        return binarySearch(key, root.left);
    }
    static void inorder(TreeNode root){
        if(root == null)return;
        inorder(root.left);
        System.out.println(root.value+ " ");
        inorder(root.right);

    }

    static void bfsTraverse(TreeNode root ){
        if(root == null)return;
        Queue<TreeNode> q1  = new LinkedList<>();
        q1.offer(root);
        while(!q1.isEmpty()){
            TreeNode curr = q1.poll();
            System.out.println(curr.value);
            if(curr.left!= null){
                q1.offer(curr.left);
            }
            if(curr.right != null){
                q1.offer(curr.right);
            }
        }


    }

    static void bfstraverseUsingStack(TreeNode root){
        if(root == null)return;
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode curr = s1.pop();
            System.out.println(curr.value);
            if(curr.right!=null){
                s1.push(curr.right);
            }
            if(curr.left!= null){
                s1.push(curr.left);
            }

        }
    }

        public static void main(String[] args) {
            // Create the root of the tree
            TreeNode root = null;

            // Insert values into the tree
            root = BfsBinaryTree.insert(10, root);
            root = BfsBinaryTree.insert(5, root);
            root = BfsBinaryTree.insert(15, root);
            root = BfsBinaryTree.insert(3, root);
            root = BfsBinaryTree.insert(7, root);
            root = BfsBinaryTree.insert(12, root);
            root = BfsBinaryTree.insert(18, root);

            // Perform inorder traversal
            System.out.println("Inorder traversal:");
            BfsBinaryTree.inorder(root);

            // Perform BFS traversal using queue
            System.out.println("\nBFS traversal using queue:");
            BfsBinaryTree.bfsTraverse(root);

            // Perform BFS traversal using stack
            System.out.println("\nBFS traversal using stack:");
            BfsBinaryTree.bfstraverseUsingStack(root);

            // Search for a value in the tree
            int searchKey = 7;
            boolean found = BfsBinaryTree.binarySearch(searchKey, root);
            System.out.println("\nIs " + searchKey + " present in the tree? " + found);
        }


}
