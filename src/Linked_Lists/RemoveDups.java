package Linked_Lists;

import java.util.HashSet;

import Linked_Lists.LinkedList.Node;

public class RemoveDups {

	//1st version 
	public LinkedList removeDups(LinkedList list) {
		
		if (list == null || list.head == null || list.head.next == null) {
			return list;
		}
		
		HashSet<Integer> dupsSet = new HashSet<Integer>();
		
		Node n = list.head;
		Node toRemove;
		dupsSet.add(n.data);
		while (n.next != null) {
			if (!dupsSet.add(n.next.data)) {
				if (n.next.next != null) {
					toRemove = n.next;
					n.next = n.next.next;
					toRemove = null;
				}else {
					n = n.next;
				}
			} else {
				n = n.next;
			}
		}
		return list;
	}
	
	// nie dziala
	public LinkedList removeDupsNoBuffer(LinkedList list) {
		
		if (list == null || list.head == null || list.head.next == null) {
			return list;
		}
		Node n = list.head;
		while (n.next != null) {
			Node runner = n.next;
			while (runner.next != null) {
				if (n.data == runner.data) {
					Node x = runner;
					runner = runner.next;				
					if (runner.next.next != null) {
						runner.next = runner.next.next;
					}
					x = null;
				} else {
					System.out.println("runner becomes " +runner.next.data);

					runner = runner.next;
				}
			}
			n = n.next;
		}
		

		return list;
	}
}
