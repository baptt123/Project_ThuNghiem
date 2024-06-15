public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> next;
    private Node<T> previous;

    public LinkedList(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public void addFirst(Node<T> node) {
        Node<T> tmp = new Node<>(node.getData(), node);
        if (head == null) {
            head = tmp;
        } else {
            head = tmp;
            head.setNext(next);
        }
    }

    public void addLast(Node<T> node) {
        Node<T> tmp = new Node<>(node.getData(), node);
        if (tail == null) {
            tail = tmp;
        } else {
            tail = tmp;
            tail.setNext(next);
        }
    }

    public void addRandom(Node<T> node, T key) {
        Node<T> tmp = head;
        while (tmp.getNext() != null && tmp.getData().equals(key)) {
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node<T>(key, node));
    }
}
