package LL.insertion;

import java.util.Scanner;

class Node{
    int value;
    Node next;
    public Node(int val){
        this.value=val;
        this.next=null;
    }
}
public class InsertionAtBegLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        Node head=null;
        Node temp=null;
        Node current=null;
        // creating the new LL
        do{
            System.out.println("Enter the node value:");
            int value=sc.nextInt();
            Node newNode=new Node(value);
            if(head==null){
                head=newNode;
            }
            else{
                temp=head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            System.out.println("Press 1 to continue");
            a=sc.nextInt(); 
        }while(a!=0);
        
        // insert at beginning
        do{
            System.out.println("Enter the node value:");
            int value=sc.nextInt();
            Node newNode=new Node(value);
            if(head==null){
                head=newNode;
            }
            else{
                temp=head;
                temp.next=head;
                head=temp;
            }
            System.out.println("Press 1 to continue");
            a=sc.nextInt(); 
        }while(a!=0);

        // traverse
        current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
        sc.close();
    }

}
