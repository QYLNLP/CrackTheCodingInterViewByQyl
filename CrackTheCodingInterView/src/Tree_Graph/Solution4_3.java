package Tree_Graph;
/**
 *     有序数组构建高度最小二叉查找树
 * @author 86131
 *
 */
public class Solution4_3 {
     public int BuildMinimalBST(int[] vals) {
    	 if(vals==null||vals.length<1)
    		 return 0;
    	 else
    		 return BuildMinimalBSTCore(vals,0,vals.length-1);
     }
     private int BuildMinimalBSTCore(int[] vals,int start,int end) {
    	 if(end<start) return 0;
    	 
    	 int mid = (end+start)/2;
    	 int left = BuildMinimalBSTCore(vals,start,mid-1);
    	 int right = BuildMinimalBSTCore(vals,mid+1,end);
    	 return left>right?left+1:right+1;
     }
}
