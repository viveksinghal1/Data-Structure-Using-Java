

public class BinaryTree {

    Node root;

    private class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    protected void insert(int data){
        root=insert(root,data);
    }

    private Node insert(Node root, int data){
        if (root==null){
            root = new Node(data);
            return root;
        }

        else {
            if (root.right==null){
                root.right= insert(root.right,data);
            }

            else if (root.left==null)
                root.left = insert(root.left,data);

            else if (root.left.right==null){

            }
        }

        return  root;
    }

    protected void display(){
        inorder(root);
    }

    private void inorder(Node root){
        if (root!=null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(200);
        binaryTree.insert(500);
        binaryTree.insert(400);
        binaryTree.insert(600);
        binaryTree.insert(800);
        binaryTree.insert(750);
        binaryTree.insert(650);
        binaryTree.display();
    }

}
