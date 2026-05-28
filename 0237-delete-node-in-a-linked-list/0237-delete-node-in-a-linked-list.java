/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;
        ListNode after;
        while(temp.next.next!=null)
        {
            after=temp.next;
            temp.val=after.val;
            temp=temp.next;
         
        }
        after=temp.next;
        temp.val=after.val;
        temp.next=null;


        
    }
}