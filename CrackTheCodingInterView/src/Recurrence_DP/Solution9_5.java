package Recurrence_DP;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串全排列
 * 
 * @author 86131
 *
 */
public class Solution9_5 {
	public static ArrayList<String> getPermutation(String A) {
		if (A == null)
			return null;
		ArrayList<String> list = new ArrayList<String>();
		if (A.length() == 1) {
			list.add(A);
			return list;
		}

		char ch = A.charAt(0);
		ArrayList<String> preList = getPermutation(A.substring(1));
		for (String str : preList) {
			for (int i = 0; i <= str.length(); i++) {
				list.add(str.substring(0, i) + ch + str.substring(i));
			}
		}
		Collections.sort(list,Collections.reverseOrder());
		return list;
	}

	public static void main(String args[]) {
		ArrayList<String> list = getPermutation("ABC");
		for(String str:list)
			 System.out.println(str+" ");
	}
}
