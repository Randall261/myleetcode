/**
 * @author randall261
 * @ClassName MiddleOfTheLinkedList
 * @Description 链表的中间结点
 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * @date 10/8/2023 6:30 下午
 */
public class MiddleOfTheLinkedList {

//    Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode[] arr = new ListNode[100];//用数组去装链表
        int index = 0;//数组下标从0开始
        while (head != null) {//如果ListNode不为空
            arr[index++] = head;//就装进数组arr
            head = head.next;//返回的是ListNode
        }
        /*for (int i = 0; i <= index/2; i++) {
            System.out.println(arr[i].val);
        }*/
        System.out.println(arr[index/2].val);
        return arr[index/2];
    }

    public static void main(String[] args) {
        ListNode Listnode = new ListNode(0);
        ListNode next;
        next = Listnode;
        for (int i = 1; i < 10; i++) {
            ListNode node = new ListNode(i);
            next.next = node;
            next = next.next;
        }
        next = Listnode;
        middleNode(Listnode);
    }
}
