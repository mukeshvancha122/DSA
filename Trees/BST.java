package Trees;

class Node{
     int data;
     Node left;
     Node right;
     public Node(int data){
        this.data=data;
     }
}
public class BST {
    public static void main(String[] args) {
        Node root=null;
        Node a=new Node(1);
        if(root==null){
            a=root;
        }
        else{
            
        }
    }
   public void insertReecord(Node root, int data){
    if(root==null){
        root = new Node(data);
    }
    if(data >root.data)
        root.left=insertReecord(root.left, data);
   }
}
