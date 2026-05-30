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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;

        }
        if(count==1)
        return true;
        ListNode first1=head;
        int mid=count/2;
        temp=head;
        for(int i=0;i<mid-1;i++)
        {
            if(temp.next!=null)
            temp=temp.next;
        }
        ListNode last1=temp;
        ListNode first2=temp.next;
        if(count%2!=0)
        first2=first2.next;
        last1.next=null;
        ListNode prev=null;
        ListNode curr=first2;
        ListNode after;
        while(curr!=null)
        {
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        first2=prev;
        ListNode temp1=first1;
        ListNode temp2=first2;
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.val!=temp2.val)
            return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;



        
    }
}