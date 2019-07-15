package Recurrence_DP;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 洪水
 * @author 86131
 *
 */
public class Solution9_7 {
    public int floodFill(int[][] map, int n, int m) {
        if(map==null||n<1||m<1||map[0][0]==1) 
        	return 0;
        Queue<Item> queue= new LinkedList<Item>();
        queue.add(new Item(0,0,0));
        map[0][0] = 2;//标记已经读取过
        //方向数组
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        while(!queue.isEmpty()) {
        	Item item = queue.poll();
        	int i = item.x ;
        	int j = item.y ;
        	int layer  = item.layer;
        	for(int k=0;k<4;k++) {
        		int x = dx[k]+i;
        		int y = dy[k]+j;
        		if(x<0||x>n-1||y<0||y>m-1||map[x][y]!=0)
        			continue;
        		if(x==n-1&&y==m-1)
        			return layer+1;
        		queue.add(new Item(x,y,layer+1));
        		map[x][y] = 2;
        	}
        }
        return -1; 
    }
    class Item{
    	int x;
    	int y;
    	int layer;
    	public Item(int x,int y,int layer) {
    		this.x = x;
    		this.y = y;
    		this.layer = layer;
    	}
    }
}
