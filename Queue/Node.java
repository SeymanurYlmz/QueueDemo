package Queue;

public class Node {
    public int id;
    public String name;
    public String department;
    public Node next;

    public Node(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.next=null;
    }

    public void displayNode(){
        System.out.println("{ "+ this.id + " | " + this.name + " | " + this.department + " }");
    }
}

