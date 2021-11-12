import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 描述
 * 给定一个节点数为n的无序单链表，对其按升序排序。
 *
 * 数据范围：0 < n \le 1000000<n≤100000
 * 要求：空间复杂度 O(n)O(n)，时间复杂度 O(nlogn)O(nlogn)
 */
public class Solution_NC70 {
    public ListNode sortInList (ListNode head) {
        // write code here
        ArrayList<Integer> list = new ArrayList();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);

        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        for(int i = 0 ; i < list.size();i++){
            ListNode node = new ListNode(list.get(i));
            temp.next = node;
            temp = temp.next;
        }


        return newHead.next;


    }
}
