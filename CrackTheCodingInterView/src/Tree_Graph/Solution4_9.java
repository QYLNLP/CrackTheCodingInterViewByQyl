package Tree_Graph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
/**
 * 数值和为N的路径
 * @author 86131
 *
 */
public class Solution4_9 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	ArrayList<ArrayList<Integer>> dList = new ArrayList<ArrayList<Integer>>();
        if(root==null||target<1)
        	return dList;
        
        FindPathCore(root,dList,new LinkedList<Integer>(),0,target);
        Collections.sort(dList, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				return o2.size()-o1.size();
			}});
    	return dList;
    }
    private void FindPathCore(TreeNode node,ArrayList<ArrayList<Integer>> dList,LinkedList<Integer> list,
    		int target,int current) {
    	if(node==null)//某个节点只有一个孩子
             return;
    	
        current +=node.val;
        list.add(node.val);
        if(node.left==null&&node.right==null) {
        	if(current==target)
            	dList.add(new ArrayList<Integer>(list));
        	list.removeLast();
            return;
        }
        
        FindPathCore(node.left,dList,list,target,current);
        FindPathCore(node.right,dList,list,target,current);
        
        list.removeLast();   
    }
}
