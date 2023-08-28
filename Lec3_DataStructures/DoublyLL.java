/**
 * List
 */
public class DoublyLL {

    Node head; // ссылка на первую позицию списка (начало)
    Node tail; // на последнюю (у односвязного списка может ее не быть)

    public void add(int value) { // будет добавление в конец через ссылку на tail
        Node node = new Node();
        node.value = value;
        if (head == null) {// список пустой
            head = node; // становится текущей нодой, обязательно заполнить и head, и tail
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void add(int value, Node node) { // добавляет value после какой-то node (в любое место списка)
        Node next = node.next; // то, на что ссылается текущая нода на данный момент
        Node newNode = new Node(); // генерация ноды
        newNode.value = value; // newNode имеет вот такое значение
        node.next = newNode; // говорим текущей ноде, что её следующее значение - это новая нода
        newNode.previous = node; // её предыдущее значение на текущий момент node
        if (next == null) {
            tail = newNode; // если у элта нет след. объекта, он последний, и его переменная должная была
                            // лежать в tail
        } else {
            next.previous = newNode;
            newNode.next = next;
        }

    }

    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }

    }

    public void revert() { // для двусвязного списка
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next; // обновляем каррентнод на следующее значение некст и продолжаем цикл до полного
                                // разворота
        }

    }

    public Node find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next; // обновили карентнод
        }
        return null;
    }

    public class Node {
        int value;
        Node next; // описывает след элт списка

        Node previous;
    }
}