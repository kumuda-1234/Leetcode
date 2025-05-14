/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode oddPtr = head;
        ListNode evenPtr = head.next;
        ListNode even = head.next;
        ListNode prev = head;
        while(oddPtr != null && evenPtr != null){
            oddPtr.next = evenPtr.next;
            oddPtr = oddPtr.next;
            if (oddPtr != null){
                prev = oddPtr;
                evenPtr.next = oddPtr.next;
                evenPtr = evenPtr.next;
            }
        }
        prev.next = even;
        return head;
    }
}