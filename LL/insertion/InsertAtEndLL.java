package LL.insertion;


public class InsertAtEndLL {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node head=a;
        Node tail=head;

        if(head==null){
            head=a;
        }
        else{
            tail.next=b;
            tail=b;
        }
    }

    
    
}
