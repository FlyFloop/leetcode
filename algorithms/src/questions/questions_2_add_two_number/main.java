package questions.questions_2_add_two_number;

public class main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(123);
        ListNode listNode2 = new ListNode(223);

        Solution solution = new Solution();
        solution.addTwoNumbers(listNode,listNode2);
    }
    static class ListNode {
    int val;
        ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dH = new ListNode(-1);
            ListNode newHead = dH;
            int carry = 0;

            while(l1!=null || l2!=null) {
                int a = l1 == null ? 0 : l1.val;
                int b = l2 == null ? 0 : l2.val;

                if(l1!=null) l1 = l1.next;
                if(l2!=null) l2 = l2.next;

                int sum = a + b + carry;
                carry = sum/10;

                ListNode newNode = new ListNode(sum%10);
                dH.next = newNode;
                dH = newNode;
            }

            if(carry!=0) {
                dH.next = new ListNode(carry);
            }
            return newHead.next;
        }
    }
}
