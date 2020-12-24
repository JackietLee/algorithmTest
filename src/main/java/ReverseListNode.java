import java.util.ArrayList;

public class ReverseListNode {
    public static class ListNode {
        int var;
        ListNode next;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (null != listNode) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.var);
        }
        return ret;
    }
}
