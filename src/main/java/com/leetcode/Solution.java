package com.leetcode;

public class Solution {
    // This class will contain utility methods that might be needed across multiple problems
    // For example, methods to create or print linked lists, trees, etc.

    // Example utility method for creating a linked list from array
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Definition for singly-linked list node
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }
}