package datastructures.singlyLinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        Node nodeOne=new Node();
        nodeOne.setValue(1);
        Node nodeTwo=new Node();
        nodeTwo.setValue(2);
        Node nodeThree=new Node();
        nodeThree.setValue(3);
        Node nodeFour=new Node();
        nodeFour.setValue(4);



        LinkedList numbers=new LinkedList(nodeOne);
        numbers.addNodeToFirst(nodeTwo);
        numbers.addNodeToFirst(nodeThree);
        numbers.addNodeToFirst(nodeFour);
//
        System.out.println(numbers);

    }

}
