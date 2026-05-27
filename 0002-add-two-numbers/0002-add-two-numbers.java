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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(-1);
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp=l3;
        int carry=0;
        int sum=0;
        int digit;
        while(temp1!=null||temp2!=null||carry!=0)
        {
            int val1=0;
            int val2=0;
            if(temp1!=null)
            val1=temp1.val;
            if(temp2!=null)
            val2=temp2.val;
            sum=val1+val2+carry;
            carry=sum/10;
            digit=sum%10;
            temp.next=new ListNode(digit);
            temp=temp.next;
            if(temp1!=null)
            temp1=temp1.next;
            if(temp2!=null)
            temp2=temp2.next;

        }
        return l3.next;

        
    }
}