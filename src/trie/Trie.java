package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    public static void main(String[] args) {
        Node c = new Node('c');
        Node a = new Node('a');
        Node r = new Node('r');
        c.addChild(a);
        a.addChild(r);
        r.isComplete = true;

        Node b = new Node('b');
        a.addChild(b);
        b.isComplete = true;

        printWords(c, new StringBuffer());
    }

    static void printWords(Node node, StringBuffer buf) {
        buf.append(node.c);
        if (node.isComplete) {
            System.out.println(buf);
        } else {
            for (Map.Entry<Character, Node> entry : node.children.entrySet()) {
                printWords(entry.getValue(), buf);
            }
        }
    }

}

class Node {
    Map<Character, Node> children = new HashMap<>();
    boolean isComplete = false;
    Character c;

    public Node(Character c) {
        this.c = c;
    }

    Node addChild(Node child) {
        if (children.containsKey(child.c)) {
            return children.get(c);
        } else {
            children.put(c, child);
            return child;
        }
    }

}