package leetcode;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head == null) return node;
        while(node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            } else node = node.next;
        }
        return head;
    }
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
}
