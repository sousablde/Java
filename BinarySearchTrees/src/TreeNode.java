
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    /**************************************
     Inserting into BST
     *************************************/
    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {//if the value we want to insert is less than the data in this node
            if (leftChild == null) {//if found a null we found an insertion point
                leftChild = new TreeNode(value);//insert the value
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    /**************************************
     Traversing BST
     level-visits nodes on each level left to right
     pre-order-visit root of each subtree first
     post-order-visit the root of each subtree last
     inorder-visit LC, then root, then RC
     *************************************/
    public void traverseInorder() {
        if (leftChild != null) {
            leftChild.traverseInorder();
        }
        System.out.print("Data = " + data + ", ");
        if (rightChild != null) {
            rightChild.traverseInorder();
        }
    }

    /**************************************
     Getting value from BST
     *************************************/
    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;//value not found
    }

    /**************************************
     Getting min value from BST
     *************************************/
    public int min() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    /**************************************
     Getting max value from BST
     *************************************/
    public int max() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
