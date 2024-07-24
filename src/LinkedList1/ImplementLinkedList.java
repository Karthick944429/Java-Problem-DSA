package LinkedList1;

public class ImplementLinkedList {

    public class Node1 {
        int data;
        Node1 next;
    }
    public int size;
    public Node1 head;
    public Node1 tail;
    public void addLast(int item){
        Node1 node1 = new Node1();
        node1.data=item;
        node1.next=null;
        if(this.size>=1){
            this.tail.next = node1;

        }
        if (this.size == 0){
            this.head= node1;
            this.tail= node1;
            size++;
        }
        else {
            this.tail= node1;
            size++;
        }
    }
    //Adding into first
    public void addFirst(int item){
        Node1 node1 = new Node1();
        node1.data=item;
        node1.next=null;
        if (this.size >= 1){
            node1.next = this.head;
        }
        if (this.size == 0){
            this.head = node1;
            this.tail = node1;
            size++;
        }
        else {
            this.head = node1;
            size++;

        }
    }
    //getting value at index
    public Node1 getNodeAtIndex(int idx){
        if (this.size==0){
            System.out.println("ll is empty");
        }
        if (idx<0||idx>=this.size){
            System.out.println("invalid index");
        }
        Node1 temp =this.head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    //remove At last
    public void removeLast(){
        if (this.size==0){
            System.out.println("ll is empty");
        }
        if (this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        Node1 sizenm1 = getNodeAtIndex(this.size-2);
        this.tail=sizenm1;
        this.tail.next=null;
        this.size--;
    }
    public void removeAt(int index){
        if (index == 0){
            System.out.println(" ll is empty");
        }
        if (this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }
        Node1 sizenm = getNodeAtIndex(index-1);
        Node1 sizenp = getNodeAtIndex(index+1);
        sizenm.next=sizenp;
        this.size--;

    }
    //displayAllNode
    public void display(){
        Node1 tmp = this.head;
        while (tmp != null){
            System.out.println(tmp.data+" ");
            tmp = tmp.next;
        }
    }

}
