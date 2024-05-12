package implementations;

public class LinkedListImpl {

    class Node{

        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    Node head;

    // Time complexity = O(n)
    public void display(){
        Node temp = this.head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    public void addLast(int data){

        if(this.head == null){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp = this.head;

        while(temp != null){
            temp = temp.next;
        }

        temp.next = node;
    }


    public void addAtIndex(int data, int idx){
        if(idx < 0){
            return;
        }
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp = this.head;

        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        Node forward = temp.next;

        temp.next = node;
        node.next = forward;
    }


    public void removeFirst(){
        this.head = this.head.next;
    }

    public void  removeLast(){
        Node temp = this.head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void removeAtIndex(int idx){

        Node temp = this.head;
        for(int i =0; i<idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }


}
