package Array_String;
/**
 *       �����Ӵ�ʶ�������ж��Ƿ�Ϊ��ת
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
