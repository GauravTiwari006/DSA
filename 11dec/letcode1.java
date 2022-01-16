// merge sort

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode list = new ListNode();
        
        if(list1.val <= list2.val){
            list = new ListNode(list1.val);
            list.next = mergeTwoLists(list1.next, list2);
        }
        else{
            list = new ListNode(list2.val);
            list.next = mergeTwoLists(list1, list2.next);
        }
        return list;
    }
}