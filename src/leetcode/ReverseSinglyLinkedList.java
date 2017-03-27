package leetcode;

public class ReverseSinglyLinkedList {

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {val = x;}
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode node = null;;
		ListNode current = head;
		while(current != null) {
			if(node == null) {
				ListNode newNode = new ListNode(current.val);
				node = newNode;
			} else {
				ListNode newNode = new ListNode(current.val);
				newNode.next = node;
				node = newNode;
			}
			current = current.next;
		}
		return node;
	}
	
	
	
}
