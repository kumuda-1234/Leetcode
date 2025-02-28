/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode *dup,*after ,*temp;
    temp=head;
    while(temp!=NULL&&temp->next!=NULL)
    {
        after=temp;
        while(after->next!=NULL)
        {
            if(temp->val==after->next->val)
            {
                dup=after->next;
                after->next=after->next->next;
                free(dup);
            }
            else
            
                after=after->next;
            
        }
        temp=temp->next;
    }
   return head;
    
}