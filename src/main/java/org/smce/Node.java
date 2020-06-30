package org.smce;

public class Node {

    private final int nodeValue;
    private Node leftNode;
    private Node rightNode;

    public Node(int nodeValue, Node leftNode, Node rightNode) {
        this.nodeValue = nodeValue;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
