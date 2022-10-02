package LinkedList;

public class dllmain {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(12);
        list.insertLast(100);
        list.insertLast(102);
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.displayReverse();
    }
}
