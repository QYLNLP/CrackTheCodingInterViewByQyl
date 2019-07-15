package Array_String;

/**
 * 翻转字符串
 * 
 * @author 86131 不用额外的数据结构和存贮结构
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
