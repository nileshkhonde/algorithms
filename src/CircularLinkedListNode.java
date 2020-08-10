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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
         ListNode fast = head;
        while (fast != null || slow != null){
            
            if(slow.next != null){
                slow = slow.next;
            }else{
                return null;
            }
            
            if(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
            }else{
                return null;
            }
            
             if (slow == fast) {
                    break;
            }
        }
        
        if (slow !=null && fast!=null && slow==fast){
            ListNode ptr1 = head;
            ListNode ptr2 = slow;
            
            while(ptr1 != null && ptr2!= null){
               if(ptr1 == ptr2){
                    return ptr1;
                }
                
                if(ptr1.next != null){
                    ptr1 =ptr1.next;
                }else{
                    return null;
                }
                
                if(ptr2.next != null){
                    ptr2 =ptr2.next;
                }else{
                    return null;
                }
                
                
            }
        }
        return null;
    }
}


