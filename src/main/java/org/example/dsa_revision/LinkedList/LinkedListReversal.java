package org.example.dsa_revision.LinkedList;

public class LinkedListReversal {

    public static  Node reverseLinkedList(Node head){

        Node prev  = null;
        Node current = head ;
        while(current !=null){
            Node next   = current.next;
            current.next=  prev  ;
            prev  =current;
            current = next;

        }
        return prev;
    }
    public static Node createALinkedList(){

        Node  head  = new Node(1);
        head.next  = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next  = new Node (4);
        return  head ;
    }
    public static void main(String[] args) {

    }
}
