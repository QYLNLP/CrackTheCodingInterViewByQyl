package Math_Prob;
import java.util.HashMap;
import java.util.Set;
/**
 *  穿点最多的直线
 * @author 86131
 *
 */
public class Solution7_6 {
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
	/**
	 * 以空间换时间，O(N^2)
	 * @param p
	 * @param n
	 * @return
	 */
    public double[] getLine(Point[] p, int n) {
    	HashMap<double[],Integer> map = new HashMap<double[],Integer>();
    	if(p==null||n<1) return new double[2];
    	for(int i=0;i<n;i++) {
    		double[] line = new double[2];
    		for(int j=0;j<n;j++) {
    			line[0] = (p[i].y-p[j].y)*1.0/(p[i].x-p[j].x);
    			line[1] = p[i].y - line[0]*p[i].x;
    		}
    		map.put(line, map.getOrDefault(line, 0)+1);
    	}
    	
    	int max = 0;;
    	double[] temp = {0,0};
    	for(double[] candi:map.keySet()) {
    		if(map.get(candi)>max) {
       			temp = candi;
       			max = map.get(candi);
    		}
    	}
        return temp;
    }
}
