package Digit;
/**
 * 找出缺失的整数
 * @author 86131
 *
 */
public class Solution5_7 {
	/**
	 * 若题目给定的数，为由小到大排列，则只用判断最后一位是否为1-0顺序变换即可
	 * @param numbers
	 * @param n
	 * @return
	 */
    public int findMissing(int[][] numbers, int n) {
    	
    	for(int i=0;i<n;i++) {
    		if(i%2!=numbers[i][0])
    			return i;
    	}
        return n;
    }
}
