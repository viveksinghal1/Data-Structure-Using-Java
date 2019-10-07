import java.util.*;

public class StackUsingList {
    int size;
    int length;
    Node top;

    protected StackUsingList(int length) {
        this.length = length;
        this.size = 0;
        this.top = null;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    protected boolean isEmpty() {
        return top == null;
    }

    protected boolean isFull() {
        return length == size;
    }

    protected void push(int data) {
        if (isFull()) {
            System.out.println("list is full");
        } else {
            Node newnode = new Node(data);
            newnode.next = top;
            top = newnode;
            size++;
        }
    }

    protected int pop() {
        if (isEmpty()) {
            System.out.println("list is empty");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            size--;
            return data;
        }
    }

    protected void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+"==>");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingList list = new StackUsingList(5);
        list.push(5);
        list.push(6);
        list.push(5);
        list.push(3);
        list.push(2);
        list.push(1);
        list.display();
        list.pop();
        list.display();
    }
}