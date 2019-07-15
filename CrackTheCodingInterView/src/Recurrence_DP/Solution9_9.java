package Recurrence_DP;
/**
 * n皇后问题
 * @author 86131
 *
 */
public class Solution9_9 {
    public int nQueens(int n) {
        int[] colums = new int[n];
        int[] result = new int[1];
        getQueensCore(0,colums,result);
        return result[0];	
    }
    private void getQueensCore(int row,int[] colums,int[] result) {
    	if(row>=colums.length) {
    		result[0]++;
    		return;
    	}
    	for(int col = 0;col<colums.length;col++) {
    		if(checkQueen(row,colums,col)){
    			colums[row] = col;
    			getQueensCore(row+1,colums,result);
    		}
    	}
    }
    private boolean checkQueen(int row,int[] colums,int col) {
    	if(row==0) return true;
        for(int row2 =0;row2<row;row2++) {
        	int colum2 = colums[row2];
        	if(colum2==col) return false;
        	if(Math.abs(colum2-col)==Math.abs(row2-row))
        		return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
    	Solution9_9 so = new Solution9_9();
    	System.out.println(so.nQueens(8));
    }
    }
