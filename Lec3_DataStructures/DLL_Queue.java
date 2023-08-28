public class DLL_Queue {
    Node head;
    Node tail;

    public void push(int value) { // очередь
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node; // обработка значения previous value (в отличие от стека)
        head = node;
    }

    public Integer peek() { // извлечение последнего элемента очереди FIFO
        Integer result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    public class Node {
        int value;
        Node next; // описывает след элт списка

        Node previous;
    }
}
