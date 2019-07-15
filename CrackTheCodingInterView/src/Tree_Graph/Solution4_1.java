package Tree_Graph;
/**
 *     二叉树平衡检查
 * @author 86131
 *
 */
public class Solution4_1 {
     public boolean isBalence(TreeNode node) {
    	 if(node ==null) return false;
    	 return isBalenceCore(node)!=-1;
     }
     
     private int isBalenceCore(TreeNode node) {
    	 if(node==null)
    		 return 0;
    	 
    	 int left = isBalenceCore(node.left);
    	 int right = isBalenceCore(node.right);
    	 int diff = Math.abs(left-right);
    	 if(left==-1||right==-1||diff>1)
    		 return -1;
    	 
    	 return left>right?left+1:right+1;
     }
}
