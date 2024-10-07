package LinkedList;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}

class LL{

    private Node head;

    LL(){
        head=null;
    }

    void add(int val){
        if(head == null){
            head=new Node(val);
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=new Node(val);
    }

    void addFirst(int val){
        if(head == null){
            head=new Node(val);
            return;
        }
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        return;
    }

    void removeFirst(){
        if(head == null) return;
        Node currNode=head;
        head=currNode.next;
        currNode=null;
        return;
    }

    void removeLast(){
        if(head == null) return;
        if(head.next == null){
            head=null;
            return;
        }
        Node currNode=head;
        while(currNode.next.next != null){
            currNode=currNode.next;
        }
        currNode.next=null;
        return;
    }

    void remove(int index){

        if(index == 0){
            removeFirst();
            return;
        }

        int i=0;
        Node currNode=head;
        while(currNode.next != null){
            if(i == index-1){
                Node temp=currNode.next;
                currNode.next=temp.next;
                return;
            }
            i++;
            currNode=currNode.next;
        }

        System.out.println("Index Out Of Bound Error");
        return;
    }

    void print(){
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    int size(){
        Node currNode=head;
        int len=0;
        while(currNode != null){
            len++;
            currNode=currNode.next;
        }
        return len;
    }
}


public class Basics {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.add(5);
        l1.addFirst(2);
        l1.print();
        l1.add(3);
        l1.print();
        l1.removeFirst();
        l1.print();
        l1.add(7);
        l1.print();
        l1.remove(3);
        l1.print();
    }
}