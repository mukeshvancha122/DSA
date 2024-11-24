package LL.manual;

class Node{
    int value;
    Node next;
    public Node(int val){
        this.value=val;
        this.next=null;
    }
}
public class ManualLL {
    public static void main(String[] args) {
        Node head;
        Node a= new Node(1);
        head=a;
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }

    }
}