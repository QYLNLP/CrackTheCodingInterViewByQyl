package Tree_Graph;
/**
 *  检查是否为二叉排序树
 * @author 86131
 *
 */
public class Solution4_5 {
      public boolean checkBST(TreeNode root) {
    	  if(root==null) return false;
    	  return checkBSTCore(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
      }
      private boolean checkBSTCore(TreeNode node, int min ,int max) {
    	  if(node==null)
    		  return true;
    	  if(node.val<min||node.val>max)
    		  return false;
    	  return checkBSTCore(node.left,min,node.val)&&checkBSTCore(node.right,node.val,max);
      }
}
