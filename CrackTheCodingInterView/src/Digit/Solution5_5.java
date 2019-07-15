package Digit;
/**
 *  整数转换
 * @author 86131
 *
 */
public class Solution5_5 {
    public static int calcCost(int a,int b) {
    	int count = 0;
    	for(int c = a^b;c!=0;c>>=1) {
    		count += (c&1)==1?1:0;
    	}
    	return count;
    }
    public static void main(String args[]) {
    	System.out.println(calcCost(10,99));
    }
}
