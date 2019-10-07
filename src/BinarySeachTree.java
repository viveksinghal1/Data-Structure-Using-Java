public class BinarySeachTree {

    Node root;

    private class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        Node node = new Node(data);
        if (root==null)
            root=node;
        else {
           Node temp = root;
           Node parent = root;
           while (temp!=null){
               parent=temp;
               if (temp.data>node.data)
                   temp=temp.left;
               else
                   temp=temp.right;
           }

           if (parent.data>node.data)
               parent.left=node;
           else
               parent.right=node;
        }
    }
}
