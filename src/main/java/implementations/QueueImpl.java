package implementations;

public class QueueImpl {

    class Node{

        int data;
        Node next;

        Node(int data){
            this.data =data;
        }
    }
    Node head;

    Node tail;

    public int dequeue(){
        int r = this.head.data;
       this.head = this.head.next;
       return r;
    }

    public void enqueue(int data){
        Node node = new Node(data);

        if(this.tail == null ){
            this.head = this.tail = node;
            return;
        }
        this.tail.next = node;
        this.tail =node;
    }
}
