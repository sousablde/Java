
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

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    /*
    implementing delete method
     */
    public void delete(int value) {
        root = delete(root, value);//we pass the root and the value we want to delete
        //returns the root of the tree
        //if the root is what we want to delete it will change the root
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        //value is smaller than the root
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        //value is greater than the root
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            //in these cases the node to delete has 0 or 1 children
            if (subtreeRoot.getLeftChild() == null) {
                //is a leaf so right child is also null
                //or has one child so return the right child
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
             /*
    to delete a node with 2 children we need to figure out what the replacement
    node is going to be
    we want minimal disruption to the existing tree structure

     */
            //node to delete has 2 children
            //find minimum value in the right subtree
            //replace the value int the subtreeroot with the smallest value
            //from the right subtree and after that delete the node
            //with the smallest value in the right subtree
            
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));

        }

        return subtreeRoot;
    }


}

