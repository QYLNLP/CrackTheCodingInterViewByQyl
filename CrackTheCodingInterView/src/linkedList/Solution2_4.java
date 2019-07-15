package linkedList;
/** 
 *  链表分割
 * @author 86131
 *
 */
public class Solution2_4 {
     public static ListNode partition(ListNode pHead,int x) {
    	 if(pHead==null) return pHead;
    	 
    	 ListNode newHead1 = new ListNode(-1);
    	 ListNode newEnd1 = newHead1;
    	 ListNode newHead2 = new ListNode(-1);
    	 ListNode newEnd2 = newHead2;
    	 
    	 ListNode current = pHead;
    	 while(current!=null) {
    		 if(current.val<x) {
    			 newEnd1.next = new ListNode(current.val);
    			 newEnd1 = newEnd1.next;
    		 }else {
    			 newEnd2.next = new ListNode(current.val);
    			 newEnd2 = newEnd2.next;
    		 }
    		 
    		 current = current.next;
    	 }
    	 if(newHead1.next==null)
    		 return newHead2.next;
    	 newEnd1.next = newHead2.next;
    	 return newHead1.next;
     }
     
     public static void main(String args[]) {
         int [] nums = {1,2,3,4,5};
         ListNode node = new ListNode(nums[0]);
         ListNode head = node;
         for(int i=1;i<nums.length;i++) {
        	 node.next = new ListNode(nums[i]);
        	 node=node.next;
        	 System.out.println("node.val = "+node.val);
         }
         partition(head,3); 
     }
     
}
