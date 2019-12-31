package Linked_Lists;

import Linked_Lists.LinkedList.Node;

public class FindKthToLast {

	public int findKthToLast(LinkedList list, int k) {
		
		if (list == null || list.head == null || list.head.next == null) {
		 throw new NullPointerException();
		}
		int length = 1;
		Node head = list.head;
		while (head.next != null) {
			length++;
			head = head.next;
			
		}
		
		if (k > length) {
			throw new IndexOutOfBoundsException();
		}
		System.out.println(length);
		
		int currentNodeIndex = 0;
		head = list.head;

		while (head.next != null) {
			if (length - currentNodeIndex - 1 == k) {
				return head.data;
			}
			currentNodeIndex++;
			head = head.next;
		}
		
		
		
		return -1;
	}
	
}
