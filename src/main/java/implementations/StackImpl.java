package implementations;

public class StackImpl {


    class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void push(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    public void pop(){
        this.head = this.head.next;
    }

    public int peek(){
        return this.head.data;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
}
