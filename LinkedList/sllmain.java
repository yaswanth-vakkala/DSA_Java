package LinkedList;

public class sllmain {
    public static void main(String[] args) {
        SLL list  = new SLL();
        list.insetFirst(12);
        list.insetFirst(15);
        list.insetFirst(20);
        list.insertLast(20);
        list.insertLast(21);
        list.insert(100, 2);
        list.insert(101, 5);
        //garbage collector will take care of these deleted nodes
        list.deleteFirst();
        list.deleteLast();
        list.delete(2);
        list.find(100);
        list.insertRec2(99,2);
        list.insertRec2(36, 0);
        list.display();


    }
}
