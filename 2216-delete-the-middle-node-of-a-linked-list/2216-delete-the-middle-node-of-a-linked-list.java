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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode temp = head ; 
        int count = 0 ; 
        while(temp!=null){
            count = count + 1;
            temp = temp.next;
        }
        if(count == 1 ){
            return null;
        }
        ListNode temp2 = head;
        int i = 1; 
        while(temp2!=null && i<count/2){
            temp2 = temp2.next ; 
            i = i+1;
        }
        temp2.next = temp2.next.next ;
        return head ;
    }
}