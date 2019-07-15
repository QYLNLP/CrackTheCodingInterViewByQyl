package Sort_Find;
/**
 * 矩阵元素查找
 * @author 86131
 *
 */
public class Solution11_6 {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        int[] res = {-1,-1};
    	if(mat==null||n<0||m<0) return res;
    	
        int row = 0;
        int colum = m-1;
        while(row<n&&colum>=0) {
        	int value= mat[row][colum];
        	System.out.println(value);
        	if(value == x)
        	{
        		res[0] = row;
        		res[1] = colum;
        		return res;
        	}
        	else if(value<x)
        		row++;
        	else
        		colum--;
        }
        return res;
    }
    public static void main(String args[]) {
    	Solution11_6 so = new Solution11_6();
    	int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    	int n = 3;
    	int m = 3;
    	int x = 5;
    	int[] res = so.findElement(mat, n, m, x);
    	System.out.println(res[0]+"   "+res[1]);
    }
}
