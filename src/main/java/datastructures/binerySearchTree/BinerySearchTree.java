package datastructures.binerySearchTree;


/*every node can have 2 childes,left child is
 less than the parent child
* and right child is bigger than parent node*/

public class BinerySearchTree {

    private TreeNode treeNode;

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }

    public TreeNode searchTreeNode(int data) {

        return treeNode.find(data);
    }

    public TreeNode deleteNode(int data){

        return treeNode.deleteNode(data);


    }

    public void inOrderTraverse(){
         treeNode.inOrderTraverse();

    }

}
