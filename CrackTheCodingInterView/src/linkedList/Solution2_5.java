package linkedList;

public class Solution2_5 {
    public ListNode plusAB(ListNode a,ListNode b) {
    	if(a==null) return b;
    	if(b==null) return a;
    	
    	ListNode ab = new ListNode(-1);
    	ListNode head = ab;
    	int nextDig = 0;
    	while(a!=null||b!=null||nextDig!=0) {
    		
    		int val1 =a!=null?a.val:0;
    		int val2 =b!=null?b.val:0;
    		ab.next = new ListNode((val1+val2+nextDig)%10);
    		nextDig = (val1+val2+nextDig)/10;
    		ab = ab.next;
    		a = a!=null?a.next:null;
    		b = b!=null?b.next:null;
    	}
    	return head.next;
    }
}
