class MyLinkedList {
    ListNode head;

    public MyLinkedList() {
      head=null;
    }
    
    public int get(int index) {
        
        ListNode temp=head;
        for(int i=0;i<index;i++)
        {
            if(temp==null)
            return -1;
            temp=temp.next;
        }
        if(temp==null)
        return -1;
        return temp.val;

    }
    
    public void addAtHead(int val) {
        ListNode temp=new ListNode(val);
        temp.next=head;
        head=temp;
        
    }
    
    public void addAtTail(int val) {
        ListNode newnode=new ListNode(val);
        
        if(head==null)
        head=newnode;
        else
        {
            ListNode temp=head;
        while(temp.next!=null)
        {
           
            temp=temp.next;
        }
        temp.next=newnode;

        }
        
        
    }
    
    public void addAtIndex(int index, int val) {
        ListNode newnode=new ListNode(val);
       
        if(index==0)
        {
            newnode.next=head;
             head=newnode;
             return;

        }
        
      
        ListNode temp=head;
        for(int i=0;i<index-1;i++)
        {
            if(temp==null)
            return;
            temp=temp.next;
        }
        if(temp==null)
        return;
        newnode.next=temp.next;
        temp.next=newnode;

       
        
        
    }
    
    public void deleteAtIndex(int index) {
        if(head==null)
        return;
        ListNode temp=head;
        if(index==0)
        {
            head=head.next;
            return;

        }
        
            for(int i=0;i<index-1;i++)
        {
            if(temp==null || temp.next==null)
            return;
            temp=temp.next;
        }
        if(temp==null||temp.next==null)
        return;
        temp.next=temp.next.next;

        
        
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */