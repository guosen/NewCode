import java.util.HashSet;

/**
 * 描述
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 *
 *
 * 数据范围：链表长度 0 \le n \le 100000≤n≤10000，链表中任意节点的值满足 |val| <= 100000∣val∣<=100000
 * 要求：空间复杂度 O(1)O(1)，时间复杂度 O(n)O(n)
 *
 * 输入分为2部分，第一部分为链表，第二部分代表是否有环，然后回组成head头结点传入到函数里面。-1代表无环，其他的数字代表有环，这些参数解释仅仅是为了方便读者自测调试。实际在编码时读入的是链表的头节点。
 *
 * 例如输入{3,2,0,-4},1时，对应的链表结构如下图所示：
 *
 * 可以看出环的入口结点为从头结点开始的第1个结点，所以输出true。
 */
public class Solution_NC4 {
    public boolean hasCycle(ListNode head) {

        ListNode pos = head ;
        HashSet<ListNode> visit = new HashSet<ListNode>();
        while(pos!=null){
            if(visit.contains(pos)){
                return true;
            }else{
                visit.add(pos);
            }
            pos = pos.next;
        }
        return false;
    }
}
