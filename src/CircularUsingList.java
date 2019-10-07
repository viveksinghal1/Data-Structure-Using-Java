import java.util.*;

public class CircularUsingList {

    Node start;//keeps track of first node
    Node end;//keeps track of last node

    protected CircularUsingList() {
        this.start = null;
        this.end = null;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    protected void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(start==null){
            start=newnode;
            newnode.next=start;
            end=newnode;
        }
        else {
            end.next=newnode;
            newnode.next=start;
            end = newnode;
        }
    }
    protected void insertAtBegin(int data){

        Node newnode=new Node(data);
        if(start==null){
            start=newnode;
            newnode.next=start;
            end=newnode;
        }

        else {
            end.next=newnode;
            newnode.next=start;
            start=newnode;
        }

    }

    protected void deleteAtEnd(){
        if(start==null){
            System.out.println("list is empty");
        }

        else if (start==end){
            start=null;
            end=null;
        }
        else {
            Node temp = start;
            while (temp.next!=end){
                temp=temp.next;
            }
            end=temp;
            temp.next=start;
        }
    }

    protected void deleteAtBegin(){
        if(start==null){
            System.out.println("list is empty");
        }

        else if (start==end){
            start=null;
            end=null;
        }

        else {
            start=start.next;
            end.next=start;
        }
    }

    protected void display(){
        if(start==null){
            System.out.println("list is empty");
        }

        else {
            Node temp = start;
            while (temp.next!=start){
                System.out.print(temp.data + "==>");
                temp=temp.next;
            }

            System.out.println(temp.data+"==>"+start.data);
        }
    }

    public static void main(String[] args) {
        CircularUsingList list = new CircularUsingList();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.display();
        list.deleteAtEnd();
        list.display();
        list.insertAtBegin(2);
        list.display();
        list.deleteAtBegin();
        list.display();
    }
}