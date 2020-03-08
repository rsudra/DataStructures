package tree;

import java.util.List;

public class Tree {
}

class Node {
    List children;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        children.add(new Node(value));
    }
}
