/**
 * 描述
 * 给定一个单链表的头结点pHead，长度为n，反转该链表后，返回新链表的表头。
 *
 * 数据范围： n\leq1000n≤1000
 * 要求：空间复杂度 O(1)O(1) ，时间复杂度 O(n)O(n)
 *
 */
public class Solution_NC78 {

    public ListNode ReverseList(ListNode head) {


        ListNode cur = head;
        ListNode nextNode = null;
        ListNode preNode = null;
        while (cur!=null){
            nextNode = cur.next;
            cur.next = preNode;
            preNode = cur;
            cur = nextNode;
        }
        return preNode;
    }


}
