package Array_String;
/**
 *      ––¡–«Â¡„
 * @author 86131
 *
 */
public class Solution1_7 {
    public int[][] clearZero(int[][] mat, int n) {
    	if(mat==null||n<1) return mat;
        
    	boolean[] x = new boolean[n];
    	boolean[] y = new boolean[n];
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			if(mat[i][j]==0) {
    				x[i]=true;
    				y[j]=true;
    			}
    		}
    	}
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<n;j++) {
    			if(x[i]||y[j])
    				mat[i][j]=0;
    		}
    	}
        return mat;
    }
}
