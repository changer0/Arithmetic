package org.learn.niuke.print_list_from_tail_to_head;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulu on 2016/12/10.
 *
 */
public class Solution {
    public static void main(String[] args) {
        ListNode root = new ListNode();
//        for (int i = 0; i < 4; i++) {
//            root.addNode(i + 1);
//        }

        ListNode newRoot = revertListNode(root);

        //打印方法
        while (newRoot.next != null) {
            System.out.println(newRoot.val);
            newRoot = newRoot.next;
        }
        System.out.println(newRoot.val);


    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        //先链表反转
        ListNode revertListNode = revertListNode(listNode);
        while (revertListNode != null) {
            ret.add(revertListNode.val);
            revertListNode = revertListNode.next;
        }
        return ret;
    }
    private static ListNode revertListNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode headNode = revertListNode(node.next);
        node.next.next = node;
        node.next = null;
        return headNode;
    }


    static class ListNode {
        int val;
        ListNode next = null;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public void addNode(int val) {
            if (next != null) {
                next.addNode(val);
            } else {
                next = new ListNode(val);
            }
        }

        public void print() {
            System.out.println(val);
        }
    }


}