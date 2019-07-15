package Math_Prob;
/**
 *  两直线相交
 * @author 86131
 *
 */
public class Solution7_3 {
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
    	return Math.abs(s1-s2)>1e-6||Math.abs(y1-y2)>1e-6;
    }
}
