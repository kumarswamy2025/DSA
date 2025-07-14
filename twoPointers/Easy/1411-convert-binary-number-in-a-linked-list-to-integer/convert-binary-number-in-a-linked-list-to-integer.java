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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        StringBuffer data=new StringBuffer();
        while(temp!=null){
            data.append(temp.val);
            temp=temp.next;

        }
       
       return  Integer.parseInt(data.toString(), 2);
    }
}