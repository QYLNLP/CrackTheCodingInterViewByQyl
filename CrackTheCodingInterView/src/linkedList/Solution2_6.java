package linkedList;
import java.util.Stack;

/**
 *  检查是否为回文数
 * @author 86131
 *
 */
public class Solution2_6 {
      public boolean isPalindrome(ListNode pHead) {
    	  if(pHead==null||pHead.next==null) return false;
    	  
    	  ListNode first = pHead.next;
    	  ListNode last = pHead;
    	  while(first!=null&&first.next!=null) {
    		  first = first.next.next;
    		  last = last.next;
    	  }
          Stack<Integer> stack = new Stack<Integer>();
          ListNode tmp = last.next;
          while(tmp!=null) {
        	  stack.push(tmp.val);
        	  tmp = tmp.next;
          }
          while(!stack.isEmpty()&&pHead.val==stack.pop()) {
        	   pHead = pHead.next;
          }
          
    	  return stack.isEmpty();
      }
}
