public class linkedlist2 {
    Node head; 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public Node mergeTwolinkedlist2(Node list1,Node list2) {
        Node l1 = list1;
        Node l2 = list2;
        Node head = new Node(-1);
        Node curr = head;
        while (l1 != null && l2 != null) {
              if (l1.data < l2.data) {
                    curr.next = l1;
                    l1 = l1.next;
              } else {
                    curr.next = l2;
                    l2 = l2.next;
              }
              curr = curr.next;
        }
        if (l1 == null) {
              curr.next = l2;
        } else {
              curr.next = l1;
        }
        return head.next;
  }
    public Node deleteduplicates(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        
        Node first = head;
        Node second = head;
        
        while(second != null){
            
            while(second != null && first.data == second.data){
                second = second.next;
            }
            first.next = second;
            first = second;
        }
        
        return head;
    }
    public Node getIntersectionNode(Node headA, Node headB) {
        Node aTemp = headA;
        Node bTemp = headB;
        int aLength = 1;
        int bLength = 1;
        while(aTemp != null) {
            aTemp = aTemp.next;
            aLength++;
        }
        while(bTemp != null) {
            bTemp = bTemp.next;
            bLength++;
        }
        
        int skip = aLength - bLength;
        if (skip < 0) {
            skip *= -1;
            while(skip > 0) {
                headB = headB.next;
                skip--;
            }
        } 
        else {
            while(skip > 0) {
                headA = headA.next;
                skip--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    void printKthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return;
 
        temp = head;
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args)
    {
        linkedlist2 llist = new linkedlist2();
        llist.push(19);
        llist.push(3);
        llist.push(16);
        llist.push(33);
 
        llist.printKthFromLast(4);
    }
} 
