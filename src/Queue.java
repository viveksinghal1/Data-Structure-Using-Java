import java.util.*;

public class Queue {

    Node front;
    Node rear;

    protected Queue(){
        this.front=null;
        this.rear=null;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    protected void enQueue(int data){
        Node newnode = new Node(data);

        if(front==null){
            front = newnode;
            rear=newnode;
        }
        else {
            rear.next=newnode;
            rear=newnode;
        }
    }

    protected void deQueue(){
        if(front==null){
            System.out.println("queue is empty");
        }

        else {
            front=front.next;
        }
    }

    protected void display(){
        Node temp = front;
        while (temp!=rear){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue qu = new Queue();
        qu.enQueue(5);
        qu.enQueue(6);
        qu.display();
        qu.deQueue();
        qu.enQueue(2);
        qu.display();
    }
}