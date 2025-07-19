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
    // flow and fast pointer
    public boolean hasCycle(ListNode head) {
        ListNode slow=head; // slow pointer start at begging node
        ListNode fast=head; // fast pointer start at begging node

       while(fast!=null && fast.next!=null ){
            // slow pointer move one step forward
            slow=slow.next;
            // fast pointer move two steps forward
            fast=fast.next.next;

            // checking if fast and slow pointers are meet at point
            if(slow==fast){  
                return true; //cycle exists
            }
        
        }
        
         return false; // cycle does not exits
  
    //   return hashsetApporach(head);

    }

    // using hashset
    static boolean hashsetApporach(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode temp = head;
        while (temp != null) {
            // if ele is already avalable in set if there then return true
            if (set.contains(temp)) {
                return true;
            }
            // if it is not present then add it to set
            else {
                set.add(temp);
                temp = temp.next;
            }
        }
        // if there is no cycle then return false
        return false;
    }
}