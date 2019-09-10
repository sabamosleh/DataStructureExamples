package datastructures.singlyLinkedList;

public class LinkedList {

    private Node node;
    private Node header;


    public LinkedList(Node node){
        this.header=node;
        this.node=node;


    }





    public void addNodeToFirst(Node node){

        System.out.println(node.getValue());
        node.setNext(header);
        System.out.println(node.getNext()+"**");
        header=node;
        System.out.println(header.getNext()+"*");

    }

    @Override
    public String toString() {



        return "linkList: {"+header.toString()+"}";
    }




}
