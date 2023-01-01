/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp;
        temp = head;
        while(temp.next != null) {
            if(!set.add(temp)) {
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }

}