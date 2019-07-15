package Array_String;
/**
 *       利用子串识别函数，判断是否为旋转
 * @author 86131
 *
 */
public class Solution1_8 {
    public boolean checkReverseEqual(String s1,String s2) {
    	if(s1==null||s2==null||s1.length()!=s2.length()) return false;
    	String con = s1+s1;	
		return con.contains(s2);
    }
}
