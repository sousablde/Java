/*
trees are hierarchical data structures
each  node can have one and only one parent
the root is a special node, it does not have a parent
every tree has a single root
ech class can have one only parent but a class can have multiple
children, so, class structures in java are an example of a tree
trees can't have cyclic paths
depth of node is the number of edges from the node to the root
height of the node is the number of edges between a node and a leaf
leaf nodes have a height of 0 (no edges)
height of a tree is the longest path from the root to a leaf
depth is calculated moving up the tree
height is calculated starting at the node
nodes at the same level do not have to have the same height

complete tree: every level except the last one has 2 children and filling
of the levels happen from the leftmost side all the interior nodes have to have
2 children

full tree: a full binary tree can also be a complete binary tree every
level is filled in full trees all internal nodes have 2 non-empty children
or are a leaf

BST: insertion, deletiion and retrievals in O(logn)
equivalent to search time in arrays
lc always smaller value than parent
rc always larger value than parent
it allows for binary search

duplicate values in BST: always store duplicates either on the left subtree
or at the right subtree
I can also maintain a counter for each node instead of adding a separate
node for the duplicate value I can just increment the counter

Inserting in BST:
-inserting into empty BST will put value at the root
-past insertions will have to be compared to the parent to make
sure smaller values are at the left and bigger values are at the right

 */
public class Main {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInorder();

    }
}
