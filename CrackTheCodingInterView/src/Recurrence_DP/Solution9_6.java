package Recurrence_DP;
import java.util.Stack;
/**
 * 括号匹配
 * @author 86131
 *
 */
public class Solution9_6 {
    public boolean chkParenthesis(String A, int n) {
    	if(A ==null||n<1) return false;
    	Stack<Character> stack = new Stack<Character>();
    	for(int i = 0;i<n;i++) {
    		char ch = A.charAt(i);
    		if(ch=='(')
    		{
                stack.push(ch);
    		}else if(ch==')') {
    			if(stack.isEmpty()||stack.peek()!='(')
    				return false;
    			stack.pop();
    		}
    	}
        return stack.empty();
    }
    
    public static void main(String args[]) {
    	Solution9_6 so = new Solution9_6();
    	String A = "())()()(((d";
    	System.out.println(so.chkParenthesis(A, A.length()));
    }
    
}
