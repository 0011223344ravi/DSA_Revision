package org.example.dsa_revision.LinkedList;


public class BasicLinkedListOperations {
   private Node head ;
    public static Node createALinkedList(){

        Node  head  = new Node(1);
        head.next  = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next  = new Node (4);
        return  head ;
    }

    public static void print(Node head){
        while(head!=null){
            System.out.print(head.value +"->");
            head = head.next;

        }
        System.out.println("null");
    }
    public static  void addAtEnd(Node head , int val){

         while(head !=null){
             if(head.next==null){
                 head.next = new Node(val);
                 head.next.next = null;
                 break;
             }
             head= head.next;
         }
    }
    public static  void deleteNode(Node head, int val){

        if(head == null){
            return;
        }
         if(head.value  ==val ){
            head=  head.next;
            return;
         }
         Node current  = head ;
          while(current.next !=null  && current.next.value !=val){
              current = current.next;
          }
           if(current.next !=null){
               current.next =  current.next.next;
           }
    }

    public static void deleteParticularIndexElement(Node head ,int index){

           if(head ==null && index <0){
               return;
           }
           if(index ==0){
           head  = head.next;
           }
           Node current = head ;
           for(int i =0; i< index-1 && current.next!=null; i++){
               current = current.next;

           }
          current.next = current.next.next;
    }

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
    public static void main(String[] args) {
        Node head  = createALinkedList();
        print(head);
        addAtEnd(head,5);
        print(head);
        deleteNode(head,4);
         print(head);
         deleteParticularIndexElement(head,2);
         print(head);
        Node c  = reverseLinkedList(head);
         print(c);
    }
}
