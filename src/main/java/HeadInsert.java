public class HeadInsert {

    static class MyLinkedList {
        int data;
        MyLinkedList next;
    }

    void printLinkedList(MyLinkedList head) {
        MyLinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
            System.out.println(temp.data);
        }
    }

    void headInsert(MyLinkedList node) {

    }
}