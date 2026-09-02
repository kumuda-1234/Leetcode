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
    public int getDecimalValue(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        count=count-1;
        temp=head;
        int sum=0;
        while(temp!=null)
        {
            sum=sum+(int)(Math.pow(2,count)*temp.val);
            count--;
            temp=temp.next;

        }
        return sum;
        
    }
}