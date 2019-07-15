package Recurrence_DP;

public class Solution9_2_2 {
    public static int countWays(int[][] map,int x, int y) {
    	int[][] counts = new int[x+1][y+1];
    	counts[1][1] = map[0][0]==1?1:0;
    	for(int i =1;i<=x;i++) {
    		for(int j=1;j<=y;j++) {
    			if(i==1&&j==1||map[i-1][j-1]==0)
    				continue;
    			counts[i][j] = (counts[i-1][j]+counts[i][j-1])%1000000007;
    		}
    	}
        return counts[x][y];
    }
}
