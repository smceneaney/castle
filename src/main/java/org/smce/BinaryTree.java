package org.smce;

public class BinaryTree {

    public Node addNodes(int[] ints) {
        if (ints.length == 0) {
            return null;
        }
        Node parentNode = new Node(ints[0], null, null);
        Node topNode = parentNode;
        for (int i = 1; i < ints.length; i++) {
            Node childNode = new Node(ints[i], null, null);
            if (childNode.getNodeValue() < parentNode.getNodeValue()) {
                parentNode.setLeftNode(childNode);
            } else {
                parentNode.setRightNode(childNode);
            }
            parentNode = childNode;
        }
        return topNode;
    }
}
