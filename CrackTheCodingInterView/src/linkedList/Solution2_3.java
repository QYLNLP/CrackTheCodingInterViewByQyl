package linkedList;
/**
 *  访问单个节点的删除
 * @author 86131
 *
 */
public class Solution2_3 {
    public boolean removeNode(ListNode node) {
    	
    	if(node!=null&&node.next!=null) {
    		int val = node.next.val;
    		node.val = val;
    		node.next = node.next.next;
    		return true;
    	} 	
    	return false;
    }
}
