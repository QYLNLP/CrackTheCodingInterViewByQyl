package Tree_Graph;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *      有向图判断路径
 * @author 86131
 *
 */
public class Solution4_2 {
	public boolean checkPath(UndirectedGraphNode a,UndirectedGraphNode b) {
		if(a==null||b==null) return false;
		
		HashSet<UndirectedGraphNode> set1 = new HashSet<UndirectedGraphNode>();
		HashSet<UndirectedGraphNode> set2 = new HashSet<UndirectedGraphNode>();
		return checkPathCore(a,b,set1)||checkPathCore(b,a,set2);
	}
	private boolean checkPathCore(UndirectedGraphNode a,UndirectedGraphNode b,
			HashSet<UndirectedGraphNode> set) {
		if(a==null) return false;
		
		if(a==b) return true;
		set.add(a);//标记已经扫描过
	    for(UndirectedGraphNode tmp:a.neighbors) {	
	    	if(!set.contains(tmp)&&checkPathCore(tmp,b,set))
		    		return true;	
	    }
		return false;
	}
	
	public class UndirectedGraphNode {
	    int label = 0;
	    UndirectedGraphNode left = null;
	    UndirectedGraphNode right = null;
	    ArrayList<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();

	    public UndirectedGraphNode(int label) {
	        this.label = label;
	    }
	}
}
