import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}
class Lab{

    Node head = null;
    public void insert(int data){

        System.out.println("inserting the element....");
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }
        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void display(){

        System.out.println("displaying the list....");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " --> " );
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void middleToTop(){
        if(head==null){
            System.out.println("list is empty");
        }

        else {
            Node temp = head;
            int c = 0;
            while (temp!=null){
                c++;
                temp=temp.next;
            }

            if(c>2){
                temp = head;
                for(int i=1;i<c/2;i++){
                    temp = temp.next;
                }

                Node temp2 = temp.next;
                temp.next=temp.next.next;
                temp2.next=head;
                head=temp2;
            }
        }
    }

    public void oddDelete(){
        System.out.println("deleting odd data node...");
        if(head==null){
            System.out.println("List is empty");
        }

        else {
            Node temp = head;
            if (head.data % 2 != 0) {
                head = head.next;
            }
                while (temp.next!= null) {
                    if (temp.next.data % 2 != 0) {
                        temp.next = temp.next.next;
                    }
                    if(temp.next!=null)
                        temp = temp.next;
                }
        }
    }

    public void delete(){
        if(head==null){
            System.out.println("list is empty");
        }

        else {
            if(head.next==null){
                head=null;
            }
            else {
                Node temp = head;
                while (temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }
    }

    public Node sort(){
        Node temp1=head;
        while (temp1.next!=null){
            Node temp2=temp1.next;
            Node temp3=temp1;
            while (temp2!=null){
                if(temp3.data>temp2.data){
                    temp3=temp2;
                }
                temp2=temp2.next;
            }
            int i;
            if(temp1!=temp3){
                i=temp1.data;
                temp1.data=temp3.data;
                temp3.data=i;
            }
            temp1=temp1.next;
        }

        return head;
    }


    public static void main(String[] args){

        Lab list = new Lab();
        list.insert(10);
        list.insert(5);
        list.insert(16);
        list.insert(2);
        list.insert(5);
        list.display();
        list.sort();
        list.display();
    }
}