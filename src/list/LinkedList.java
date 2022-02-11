package list;

public class LinkedList{
    private Node head;
    private Node tail;
 
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
 
    public Node head(){
        return head;
    }
 
    public void add(Node node){
        tail.setNext(node);
        tail = node;
    }
 

}
