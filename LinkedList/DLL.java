package LinkedList;

public class DLL {
    private Node head;
    private Node tail;

    private int size;

    public DLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if (head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        
    }

    public void deleteFirst(){
        if (head.next == null){
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast(){
        if (tail == head){
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void delete(int index){

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void displayReverse(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
        System.out.println("start");
    }

}
