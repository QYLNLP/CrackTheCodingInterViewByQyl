package Sort_Find;
/**
 * 维护x的秩
 * @author 86131
 * 数据流，动态排序，二叉排序树
 */
public class Solution11_8 {
     class BSNode{
    	 int val;
    	 int pres;
    	 BSNode left;
    	 BSNode right;
    	 public BSNode(int val) {
    		 this.val = val;
    		 this.pres = 0;
    	 }
     }
     public int[] getRankOfNumber(int[] A, int n) {

    	 int[] res = new int[n];
    	 if(A==null||n<1) return res;
    	 
    	 BSNode head = new BSNode(A[0]);
    	 res[0] = 0;
		 int[] num = new int[1];
    	 for(int i=1;i<n;i++) {
    		 num[0] = 0;
    		 BSNode node = head;
    		 insertValue(node,A[i],num);
    		 res[i] = num[0];
    	 }
         return res;
     }

     private void insertValue(BSNode node,int value,int[] num) {
    	 if(value== node.val) {
    		 node.pres++;
    		 num[0] +=node.pres;
    	 }else if(value>node.val) {
			 num[0]+=node.pres+1;
    		 if(node.right==null) {
    			 node.right = new BSNode(value); 
    		 }
    		 else {
    			 insertValue(node.right,value,num);   			 
    		 }
    	 }
    	 else {
    		 node.pres++;
    		 if(node.left==null)
    			 node.left = new BSNode(value);
    		 else
    			 insertValue(node.left,value,num);
    	 }
     }
     
     public static void main(String args[]) {
    	 Solution11_8 so = new Solution11_8();
    	 int[] A = {1,3,2};
    	 int n = 3;
    	 int[] res = so.getRankOfNumber(A, n);
    	 for(int re:res) {
    		 System.out.print(re+" , ");
    	 }
     }
}
