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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode f = list1;
        ListNode s = list2;
        ListNode dummy = new ListNode(-1);
        if(f.val <= s.val){
            ListNode newnode = f;
            dummy.next = newnode;
            f = f.next; 
            
        }else{
            ListNode newnode = s;
            dummy.next = newnode;
            s = s.next; 
        
        }
        ListNode temp = dummy.next;
        while(f!=null && s!=null){
            if(f.val <= s.val){
                ListNode newnode = f ;
                temp.next = newnode;
                f = f.next; 
                temp = temp.next;
            }else{
                ListNode newnode = s ; 
                temp.next = newnode ; 
                s = s.next ; 
                temp = temp.next;
                
            }
        }
        while(f != null){
            ListNode newnode = f;
            temp.next = newnode ; 
            temp = temp.next ; 
            f = f.next ; 
        }
        while(s != null){
            ListNode newnode = s;
            temp.next = newnode ; 
            temp = temp.next ; 
            s = s.next ; 
        }
        return dummy.next ; 
    }
}