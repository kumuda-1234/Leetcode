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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            cnt++;
        }
        int act=cnt-n;
        if(act==0)
        {
            head=head.next;
            return head;

        }
        ListNode tmp=head;
        for(int i=0;i<act-1;i++)
        {
            tmp=tmp.next;
        }
       tmp.next=tmp.next.next;
        return head;
        
    }
}