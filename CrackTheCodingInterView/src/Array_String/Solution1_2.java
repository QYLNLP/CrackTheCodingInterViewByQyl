package Array_String;

/**
 * ��ת�ַ���
 * 
 * @author 86131 ���ö�������ݽṹ�ʹ����ṹ
 */
public class Solution1_2 {
	public String reverseString(String str) {
		if (str == null || str.length() < 2)
			return str;
		StringBuffer sb = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public String reverseString1(String str) {
		if (str == null || str.length() < 2)
			return str;
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}
}
