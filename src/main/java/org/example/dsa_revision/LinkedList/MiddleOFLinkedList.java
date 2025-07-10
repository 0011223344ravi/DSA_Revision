package org.example.dsa_revision.LinkedList;

public class MiddleOFLinkedList {

   public static Node findMiddleOfLinkedList(Node head){

        Node slow  =head;
        Node fast = head ;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node createALinkedList(){

        Node  head  = new Node(1);
        head.next  = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next  = new Node (4);
        return  head ;
    }
    public static void main(String[] args) {

        Node head  =createALinkedList();
       Node middle  = findMiddleOfLinkedList(head);
        System.out.println("Middle of linked list is "+middle.value);
    }
}
