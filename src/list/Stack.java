package list;

public class Stack {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else  {
            return -1;
        }
    }

    public void push(int data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            top.next = node;
        }
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }
}
