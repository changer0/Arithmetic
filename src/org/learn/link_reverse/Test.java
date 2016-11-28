package org.learn.link_reverse;

/**
 * Created by lulu on 2016/11/28.
 * 链表反转
 */
public class Test {
    public static void main(String[] args) {
        NodeManager nodeManager = new NodeManager();
        nodeManager.add(new NodeManager.Node(2));
        nodeManager.add(new NodeManager.Node(4));
        nodeManager.add(new NodeManager.Node(6));
        nodeManager.add(new NodeManager.Node(8));
        nodeManager.add(new NodeManager.Node(10));
        nodeManager.add(new NodeManager.Node(12));
        nodeManager.add(new NodeManager.Node(14));
        nodeManager.add(new NodeManager.Node(16));
        System.out.println("链表反转前");
        nodeManager.print();
        NodeManager.Node root = reverserLink(nodeManager.root);
        nodeManager = new NodeManager(root);
        System.out.println("\n链表反转后");
        nodeManager.print();
    }

    // 反转算法
    public static NodeManager.Node reverserLink(NodeManager.Node node) {
        if (node == null || node.nextNode == null) {
            return node;
        }
        NodeManager.Node nodeHeader = reverserLink(node.nextNode);
        node.nextNode.nextNode = node;
        node.nextNode = null;
        return nodeHeader;
    }
}
