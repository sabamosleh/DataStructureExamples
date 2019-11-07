package datastructures.binerySearchTree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode find(int data){

        if(data==this.data){
            return this;
        }else
        if(this.data>data && this.leftChild!=null){
            return this.leftChild.find(data);
        }else if(this.data<data && this.rightChild!=null) {
            return this.rightChild.find(data);
        }
        else
            return null;

    }

    public void insertNode(TreeNode node){



        if(data>node.getData() && this.leftChild==null){

            leftChild.insertNode(node);

        }if(data<node.getData() && this.rightChild==null) {
            rightChild.insertNode(node);
        }


    }

    //for the leaf or a parent with one child
    public TreeNode deleteNode(int data){

        TreeNode currntNode=this;
        TreeNode parrent=this;
        System.out.println("in delete method");

        if(currntNode.data>data && currntNode.leftChild!=null){
            parrent=currntNode;
            currntNode=this.leftChild;
            currntNode.deleteNode(data);
            if(currntNode.data==data && currntNode.rightChild!=null) {
                parrent.setRightChild(currntNode.rightChild);
                System.out.println("node deleted!");
            }
            else if(currntNode.data==data && currntNode.leftChild!=null) {
                parrent.setLeftChild(currntNode.leftChild);
                System.out.println("node deleted!");
            }
            else  if(currntNode.data==data && currntNode.rightChild==null){

                parrent.setRightChild(null);
                System.out.println("node deleted!");


            }


        } if(currntNode.data<data && currntNode.rightChild!=null) {
            parrent=currntNode;
            currntNode=this.rightChild;
            currntNode.deleteNode(data);
            if(currntNode.data==data && currntNode.rightChild!=null) {
                parrent.setRightChild(parrent.rightChild.rightChild);
                System.out.println("node deleted!");
            }
           else if(currntNode.data==data && currntNode.leftChild!=null) {
                parrent.setLeftChild(currntNode.leftChild);
                System.out.println("node deleted!");
            }
              else  if(currntNode.data==data && currntNode.rightChild==null){

                  parrent.setRightChild(null);
                  System.out.println("node deleted!");


            }
            }




        return this;

    }

//    public int smallest(int data){
//
//       return 0;
//
//    }

//    public int biggest(int date){
//    }

    //meets [left root right] recursively:
    // go recursively to the left subtree then root then recursively traverse the right subtree
    public void inOrderTraverse(){

        if(this.leftChild!=null ) {
            this.leftChild.inOrderTraverse();
        }

        System.out.println(this.data);

        if(this.rightChild!=null) {

            this.rightChild.inOrderTraverse();
        }


    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
