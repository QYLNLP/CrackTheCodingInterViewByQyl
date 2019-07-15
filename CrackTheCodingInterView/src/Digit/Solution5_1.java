package Digit;
/**
 *  二进制插入
 * @author 86131
 *
 */
public class Solution5_1 {
    public int binInsert(int n, int m, int j, int i) {
    	if(j<0||i<0||n<m) return -1;
    	int tmp2 = ~(1<<(i+1)-1)|(1<<j-1);
    	int result =n&tmp2;
    	result |=m<<j;
    	return result;
    }
    
    public static void main(String args[]) {
    	Solution5_1 so = new Solution5_1();
    	System.out.println(so.binInsert(4355, 4, 2, 7));
    }
}
