package list;

public class Queue {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head; // remove from the head
    Node tail; // add to the tail

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return head.data;
        } else {
            return -1;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

}


