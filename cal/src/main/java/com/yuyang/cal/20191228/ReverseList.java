
/**
 * @Description:
 * @Author: Eayon Yu (yuyang@able-elec.com)
 * @CreateDate: 2019/11/22 下午1:59
 * @Version: 1.0
 */
public class ReverseList {

    public class ListNode {
      int temp;
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode reverse(ListNode head){

        if (head == null || head.next == null) {
            return head;

        }

        ListNode second = head.next;
        ListNode reverseHead = reverse(second);
        second.next=head;
        head.next=null;
        return reverseHead;



    }


}
