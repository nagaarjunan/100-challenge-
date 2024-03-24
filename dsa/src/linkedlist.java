public class linkedlist {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

   public void insertAtFirst(int data){

       Node newNode = new Node(data);
       newNode.next=head;
       head=newNode;
       size++;

   }

   public void insertAtMiddle(int data,int location){
       Node newNode=new Node(data);
       if(location<0){
           System.out.println("enter the valid input!......");
       }
       else{
           Node temp=head;
           for(int i=0;i<location;i++){
               temp=temp.next;
           }
           temp.next=newNode;
           size++;
       }
   }

    public void insertAtLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newNode;

        size++;

    }

    public void display(){
       if(head==null){
           System.out.println("the list is empty!...........");
       }
       else{
           Node temp=head;
           while(temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
    }

    public static void main(String args[]){
        linkedlist sl=new linkedlist();
        sl.insertAtFirst(20);
        sl.insertAtFirst(209);
        sl.insertAtFirst(20937);
        sl.insertAtLast(90);
        sl.insertAtMiddle(8989,2);


        sl.display();
    }
}
