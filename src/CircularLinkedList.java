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
public class CircularLinkedList {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null || slow != null){
            if(slow.next != null && fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
                
                if (slow == fast) {
                    return true;
                }
            }else{
                break;
            }
        }
        return false;
    }
}
