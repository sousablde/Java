
public class Tree {

    //with the root we can reach all the other
    //elements in the tree by traversing
    private TreeNode root;

    //to insert if the tree is empty then the first
    //data will become the root
    //if it is not empty we will have to compare the values to
    //the root node
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInorder() {
        if (root != null) {
            root.traverseInorder();
        }
    }


}
