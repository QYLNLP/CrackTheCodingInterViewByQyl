package Math_Prob;
/**
 *  評分正方形的直綫
 * @author 86131
 *
 */
public class Solution7_5 {
	public class Point {
	    int x;
	    int y;
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public Point() {
	        this.x = 0;
	        this.y = 0;
	    }
	}
    public double[] getBipartition(Point[] A, Point[] B) {
        if(A==null||B==null) return null;
        double[] a = getMiddle(A);
        double[] b = getMiddle(B);
        //题中保证斜率存在，故不用测试
        double[] res = new double[2];
        res[0] = (a[1]-b[1])/(a[0]-b[0]);
        res[1] = a[1]-a[0]*res[0];
    	return res;
    }
    private double[] getMiddle(Point[] a) {
    	double[] res =new double[2];
    	for(int i=0;i<4;i++) {
    		res[0] += a[i].x;
    		res[1] += a[i].y;
    	}
    	res[0] /=4.0;
    	res[1] /=4.0;
    	return res;
    }
}
