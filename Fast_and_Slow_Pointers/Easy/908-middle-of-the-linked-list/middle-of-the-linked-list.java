/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // using slow and fast pointer
    public ListNode middleNode(ListNode head) {
         ListNode slow=head; // slow pointer start at begging node
        ListNode fast=head; // fast pointer start at begging node

       while(fast!=null && fast.next!=null ){
            // slow pointer move one step forward
            slow=slow.next;
            // fast pointer move two steps forward
            fast=fast.next.next;

            
        
        }
        
          return slow;   // middle ele
      
        //  return bruteForce(head);
    
    }

    // brute force apporach :  traverse linked list and count elements and divide by 2 we get middle element 
    static ListNode bruteForce(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        temp=head;
        // traverse head upto count/2 times
        for(int i=0;i<count/2;i++){
       
       temp=temp.next;
     
        }

        return temp;
    }

}