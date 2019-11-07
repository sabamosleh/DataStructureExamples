package datastructures.binerySearchTree;

public class TestBinerySearchTree {

    public static void main(String[] args) {


        TreeNode treeNodeOne=new TreeNode();
        treeNodeOne.setData(52);
        TreeNode treeNodeTwo=new TreeNode();
        treeNodeTwo.setData(33);
        TreeNode treeNodeThree=new TreeNode();
        treeNodeThree.setData(65);
        TreeNode treeNodeFour=new TreeNode();
        treeNodeFour.setData(25);
        TreeNode treeNodeFive=new TreeNode();
        treeNodeFive.setData(39);
        TreeNode treeNodeSix=new TreeNode();
        treeNodeSix.setData(60);
        TreeNode treeNodeSeven=new TreeNode();
        treeNodeSeven.setData(78);
        TreeNode treeNodeEight=new TreeNode();
        treeNodeEight.setData(90);


        treeNodeOne.setLeftChild(treeNodeTwo);
        treeNodeOne.setRightChild(treeNodeThree);
        treeNodeTwo.setRightChild(treeNodeFive);
        treeNodeTwo.setLeftChild(treeNodeFour);
        treeNodeThree.setLeftChild(treeNodeSix);
        treeNodeThree.setRightChild(treeNodeSeven);
        treeNodeSeven.setRightChild(treeNodeEight);



        System.out.println(treeNodeOne);


//        TreeNode searchNode=new TreeNode();
//        searchNode.setData(0);
        BinerySearchTree bst=new BinerySearchTree();
        bst.setTreeNode(treeNodeOne);
//        System.out.println(bst.deleteNode(33));
        bst.inOrderTraverse();




    }

}
