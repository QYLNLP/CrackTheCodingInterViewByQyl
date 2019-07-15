package Tree_Graph;
/**
 *     与程序员金典中地题目的理解颇有不同
 */

import linkedList.ListNode;

public class Solution4_4 {

	ListNode head = new ListNode(-1);
	ListNode current = head;
    public ListNode getTreeLevel(TreeNode root, int dep) {
    	if(root ==null||dep<1) return null;
    	getTreeLevelCore(root ,dep);
        return head.next;
    }
    private void getTreeLevelCore(TreeNode root,int dep) {
        if(dep<=0||root==null)
            return;
    	if(dep==1)
    	{
    		current.next = new ListNode(root.val);
    		current = current.next;
    		return ;
    	}
    	getTreeLevelCore(root.left,dep-1);
    	getTreeLevelCore(root.right,dep-1);
    }
}
