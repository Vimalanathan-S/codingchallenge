class Solution {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) 
        return l2;
        else if(l2 == null) 
        return l1;
        ListNode dummy = new ListNode(0);
        ListNode c = dummy;
        while(l1 != null && l2!= null){
            if(l1.val <= l2.val){
                c.next = l1;
                l1 = l1.next;
            }else {
                c.next = l2;
                l2 = l2.next;
            }
            c = c.next;
        }
        c.next = l1 == null? l2:l1;
        return dummy.next;
}
}
    