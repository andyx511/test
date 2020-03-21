package 链表;

public class 链表反转 {
    /*public 链表.ListNode ReverseList(链表.ListNode head) {
        链表.ListNode next = null;
        链表.ListNode pre = null;
        while (head != null) {
            // 保存要反转到头的那个节点
            next = head.next;
            // 要反转的那个节点指向已经反转的上⼀个节点(备注:第⼀次反转的时候会指向null)
            head.next = pre;
            // 上⼀个已经反转到头部的节点
            pre = head;
            // ⼀直向链表尾⾛
            head = next;
        }
        return pre;
    }*/
    public ListNode ReverseList(ListNode head){
        ListNode next = null;
        ListNode pro = null;
        while (head!=null){
            next = head.next;
            head.next = pro;
            pro = head;
            head = next;
        }
        return pro;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b; b.next = c; c.next = d; d.next = e;
        new 链表反转().ReverseList(a);
        while (e != null) {
            System.out.println(e.val);
            e = e.next;
        }
    }
}