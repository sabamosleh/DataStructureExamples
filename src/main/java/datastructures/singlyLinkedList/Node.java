package datastructures.singlyLinkedList;

public class Node {

    private Node next;
    private int value;

    public Node(){}


    public Node( int value) {
        this.next = null;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }





    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{"+this.getValue()+"|"+this.getNext()+"}";
    }
}
