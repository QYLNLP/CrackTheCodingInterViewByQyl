package Recurrence_DP;
/**
 *  机器人走方格
 * @author 86131
 *
 */
public class Solution9_2_1 {
    public static int countWays(int x, int y) {
    	int[][] counts = new int[x+1][y+1];
    	counts[1][1] = 1;
    	for(int i =1;i<=x;i++) {
    		for(int j=1;j<=y;j++) {
    			if(i==1&&j==1)
    				continue;
    			counts[i][j] = counts[i-1][j]+counts[i][j-1];
    		}
    	}
        return counts[x][y];
    }
    public static void main(String args[]) {
    	System.out.println(countWays(2,2));
    }
}
