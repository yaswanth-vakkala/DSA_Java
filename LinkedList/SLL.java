package LinkedList;
/*
Limitations of arrays/arraylists:

-Internally arrays are not continuos memory allocations even though we consider it as when we work with arrays.
-arrays are fixed in size and once full we cant add new elements
-but arraylist class solves fixed size problem with apporach in which once arr reaches specific size
 a new arr of double size is created automatically all old arr elements are copied into it.
 this has O(1) time complexity and efficient but its limiting us.
-linked list is not continous in definition. we have diff values at random memory places in heap
 and they are connected with each other. No index values will be present in ll
-ll terms - node(individual box in ll), ref vars head and tail pointing to starting and ending
 element.
-Each box is of type Node class itself(we define it).
-Node class has properties of a value and next field which points to next Node type object.

*/

//        Built in java collections linkedlist
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(12);

public class SLL {
    private Node head;
    private Node tail;

    private int size;

    public SLL(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next; //by default if no obj is provided points to null

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insetFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(tail == null){
            insetFirst(value);
            return; // can also use else statement

        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        //if ifelse not used use return
        if (index == 0){
            insetFirst(value);
        }else if(index == size){
            insertLast(value);
        }else{
            Node temp = head;
            for (int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }
    }

    //inserting using recursion
    /*2 approaches to insert using recursion
    * 1. void return type and make changes in ll
    * 2. node return type that returns the list node to change the structure*/

    public void insertRec1(int value, int index){

    }

    public void insertRec2(int value, int index){
        head = insertRec2(value, index, head);
    }

    private Node insertRec2(int value, int index, Node node){
        if (index==0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec2(value, index-1, node.next);
        return node;
    }

    public void deleteFirst(){
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
    }

    public void deleteLast(){
        if (size <= 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void delete(int index){
        if (index == 0){
            deleteFirst();
        }else if(index == size-1){
            deleteLast();
        }else{
            Node temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void find(int value){
        Node node = head;
        while (node!=null){
            if (node.value == value){
                System.out.println("value "+value+" found");
                return;
            }
            node = node.next;
        }
        System.out.println("Value "+ value + " not found");
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}
