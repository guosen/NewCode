public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public void addNode(ListNode node){
        next = node;
    }
}
