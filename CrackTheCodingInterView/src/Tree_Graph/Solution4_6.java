package Tree_Graph;
import java.util.ArrayList;
/**
 *  查找二叉树的下一个节点
 * @author 86131
 *  如果给出的根节点，和节点值，则根据中序遍历即可
 */
public class Solution4_6 {
    public int findSucc(TreeNode root,int p) {
    	if(root ==null)
    		return -1;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	getMiddleOrder(root,list);
    	int index = list.indexOf(p)+1;
    	return index>list.size()?-1:list.get(index);
    }
    private void getMiddleOrder(TreeNode root,ArrayList<Integer> list) {
    	if(root == null)
    		return;
    	
    	getMiddleOrder(root.left,list);
    	list.add(root.val);
    	getMiddleOrder(root.right,list);
    }
}
