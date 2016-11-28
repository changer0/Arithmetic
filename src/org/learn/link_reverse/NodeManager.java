package org.learn.link_reverse;

/**
 * Created by lulu on 2016/11/28.
 */
// 节点管理类
public class NodeManager {

    Node root; //根节点
    public NodeManager() {

    }

    public NodeManager(Node root) {
        this.root = root;
    }

    // 添加
    public void add(Node node) {
        if (root != null) {
            // 调用Node中的添加方法
            root.add(node);
        } else {
            root = node;
        }
    }

    // 打印
    public void print() {
        if (root != null) {
            root.print();
        }
    }

    // 节点类
    public static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }

        private void add(Node node) {
            if (nextNode == null) {
                nextNode = node;
            } else {
                nextNode.add(node);
            }
        }

        private void print() {
            System.out.print(data + " ");
            if (nextNode != null) {
                nextNode.print();
            }
        }

    }

}
