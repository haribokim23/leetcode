package p00xx.p0002;

// 제목 : Add Two Numbers

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        ListNode temp = sum;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            value %= 10;

            temp.next = new ListNode(value);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            l1 = l2;
        }

        while (l1 != null) {
            int value = l1.val + carry;
            carry = value / 10;
            value %= 10;

            temp.next = new ListNode(value);
            temp = temp.next;
            l1 = l1.next;
        }

        if (carry == 1) {
            temp.next = new ListNode(1);
        }

        return sum.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
