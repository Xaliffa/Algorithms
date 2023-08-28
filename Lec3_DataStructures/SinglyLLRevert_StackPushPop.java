public class SinglyLLRevert_StackPushPop {

    Node head;

    public void push(int value) { // stack - добавляем элт в начало списка
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop() { // stack - извлечение элта из начала списка
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public void revert() {
        if (head != null && head.next != null) {
            // Node temp = head;
            revert(head.next, head);
            // temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null; // или вариант убрать эту строку и добавить закомменченное выше
    }

    public class Node {
        int value;
        Node next;
    }
}
