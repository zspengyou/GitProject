package chapter6LInkedListArray;
//http://www.lintcode.com/en/problem/insert-into-a-cyclic-sorted-list/

import lintCode.ListNode;

//Given a node from a cyclic linked list which has been sorted, 
//write a function to insert a value into the list such that it remains a cyclic sorted list. 
//The given node can be any single node in the list. 
//Return the inserted new node.

//Given a list, and insert a value 4:
//3->5->1
//Return 5->1->3->4
public class InsertIntoCyclicSortedList {

	public static void main(String[] args) {
		InsertIntoCyclicSortedList test = new InsertIntoCyclicSortedList();
		ListNode node = new ListNode(1);
		ListNode result = test.insert(node, 4);
		while (result != null) {
			System.out.println(result);
			result = result.next;
		}
	}

	public ListNode insert(ListNode node, int x) {
		ListNode toBeInserted = new ListNode(x);
		if (node == null) {
			toBeInserted.next = toBeInserted;
			return toBeInserted;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = node;
		while (node.next != dummy.next) {
			if (node.val < node.next.val && x >= node.val && x <= node.next.val) {
				insertNode(node, toBeInserted);
				return toBeInserted;
			}
			if (node.val > node.next.val && (x >= node.val || x <= node.next.val)) {
				insertNode(node, toBeInserted);
				return toBeInserted;
			}
			node = node.next;
		}
		insertNode(node, toBeInserted);
		return toBeInserted;
	}

	private void insertNode(ListNode previous, ListNode toBeInserted) {
		ListNode tmp = previous.next;
		previous.next = toBeInserted;
		toBeInserted.next = tmp;
	}
	
    public ListNode insert2(ListNode node, int x) {
        // Write your code here
       if (node == null) {
            node = new ListNode(x);
            node.next = node;
            return node;
        }

        ListNode p = node;
        ListNode prev = null;
        do {
            prev = p;
            p = p.next;
            if (x <= p.val && x >= prev.val) { 
                break;
            }
            if ((prev.val > p.val) && (x < p.val || x > prev.val)) {
                break;
            }
        } while (p != node);

        ListNode newNode = new ListNode(x);
        newNode.next = p;
        prev.next = newNode;
        return newNode;
    }

}
