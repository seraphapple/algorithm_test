package com.mrh.algorithm.addtwonums;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 return addTwoListNode(l1, l2, false);
	 }
	 
	 private ListNode addTwoListNode(ListNode l1, ListNode l2, boolean increase) {
		 int sum =  (l1 == null ? 0:l1.val) + (l2 == null ? 0:l2.val) + (increase?1:0);
		 Boolean increaseNext = (sum>=10);
		 ListNode resultNode = new ListNode(sum - (increaseNext? 10:0));
		 if((l1 != null && l1.next != null) || (l2 != null && l2.next != null) || increaseNext) {
			 resultNode.next = addTwoListNode((l1 == null ? null:l1.next), (l2 == null ? null:l2.next),increaseNext);
		 }
		 return resultNode;
	 }
}
