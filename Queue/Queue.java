package Queue;


public class Queue {

    private Node front;
    private Node rear;


    public void enqueue(int value, String value1, String value2){
        Node newList=new Node(value,value1,value2);

        if (front==null){
            front=newList;
            rear=newList;
        }
        else {
            rear.next=newList;
            rear=newList;
        }
    }

    public void dequeue(){


        if (isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        else {
            front=front.next;
        }

        if (front==null){
            rear=null;
        }
    }

    public void peek(){

        if (isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        else {
            System.out.println("front --> " + "{ "+ front.id + " | " + front.name + " | " + front.department + " }");
        }
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        Node current = this.front;
        while (current!= null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return this.front==null && this.rear==null;
    }
}
