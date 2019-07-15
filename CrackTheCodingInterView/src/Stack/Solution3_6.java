package Stack;
import java.util.ArrayList;
import java.util.Stack;
/**
 *  按升序对栈排列
 * @author 86131
 *
 */
public class Solution3_6 {
      public ArrayList<Integer> twoStacksSort(int[] numbers){
    	  if(numbers==null||numbers.length<1)
    		  return null;
    	  Stack<Integer> stack1 = new Stack<Integer>();
    	  Stack<Integer> stack2 = new Stack<Integer>();
    	  for(int s:numbers)
    		  stack1.add(s);
    	  while(!stack1.empty()) {
    		  int temp = stack1.pop();
    		  while(!stack2.empty()&&stack2.peek()>temp)
    			  stack1.add(stack2.pop());
    		  stack2.add(temp);
    	  }
    	  //创建ArraList时，需要将栈取反
    	  while(!stack2.isEmpty()) {
    		  stack1.add(stack2.pop());
    	  }
    	  return new ArrayList<Integer>(stack1);
      }
}
