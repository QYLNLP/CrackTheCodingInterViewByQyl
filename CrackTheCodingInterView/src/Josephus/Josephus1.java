package Josephus;
/**
 * 原版约瑟夫环
 * @author 86131
 *
 */
public class Josephus1 {
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val = val;
		}
	}
	/**
	 * 链表方法
	 * @param n
	 * @param m
	 * @return
	 */
    public int getResult(int n, int m) {
       if(n<1||m<1) return -1;
       Node head = new Node(1);
       Node node = head;
       for(int i=2;i<=n;i++) {
    	   node.next = new Node(i);
    	   node = node.next;
       }
       node.next =head;

       while(head.next!=head) {
    	   int count =2;
    	   while(count<m) {
    		   head = head.next;
    		   count++;
    	   }
    	   head.next = head.next.next;
    	   head = head.next;
       }
       return head.val;
    }
    /**
     * 数组方法
     * @param n
     * @param m
     * @return
     */
    public int getResult1(int n,int m) {
    	int[] array =new int[n];
    	int b = n;
    	int index = 0;
    	int pre =0;;
    	while(b>0) {
    		int count =0;
    		while(count<m) {
    			if(array[index]==0)
    				count++;
    			index = index==n-1?0:index+1;
    		}
    		pre = index==0?n-1:index-1;
    		array[pre] =1;
    		b--;
    	}
    	
		return pre+1;
    }
    public static void main(String args[]) {
    	Josephus1 jp =new Josephus1();
    	System.out.println(jp.getResult1(550,738));
    }
}
