package Josephus;

/**
 * 约瑟夫环2
 * @author 86131
 *
 */
public class Josephus2 {
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val = val;
		}
	}
	/**
	 * 用单链表实现
	 * @param n
	 * @return
	 */
    public int getResult(int n) {
        Node head = new Node(1);
        Node node = head;
        for(int i =2;i<=n;i++) {
        	node.next = new Node(i);
        	node = node.next;
        }
        node.next = head;
        
        int size =2;
        int count ;
        Node tmpHead = head;
        while(tmpHead.next!=tmpHead) {
        	Node pre = tmpHead;
        	Node cur = pre.next;
        	count =2;
        	while(cur!=tmpHead) {
        		if(count%size==1)
        		{
        			pre.next = cur;
        			pre = pre.next;
        	        System.out.println("cur.val "+cur.val);
        		}
        		cur = cur.next;
        		count++;
        	}
        	size++;
        	pre.next = tmpHead;
        	tmpHead = pre;
        }
    	return tmpHead.val;
    }
    public static void main(String args[]) {
    	Josephus2 jo = new Josephus2();
    	System.out.println(jo.getResult(5));
    }
    

}
