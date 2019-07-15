package Array_String;

import java.util.Arrays;

/**
 *      �ַ���ת���ж�
 * * @author 86131
 *
 */
public class Solution1_3 {
	/**
	 *     �����¼������Ȼ��Ӽ�
	 * @param strA
	 * @param strB
	 * @return
	 */
   public boolean checkSam(String strA,String strB) {
	  if(strA==null||strB==null||strA.length()!=strB.length()) return false;
	  int len = strA.length();
	  int[] num = new int[256];
	  for(int i=0;i<len;i++) {
		  num[strA.charAt(i)]++;
	  }
	  for(int j =0;j<len;j++) {
		  if(--num[strB.charAt(j)]<0)
		      return false;
	  }
	  return true;
   }
   /**
    *  �����Ƚ�
    * @param strA
    * @param strB
    * @return
    */
   public boolean checkSam1(String strA,String strB) {
	   if(strA==null||strB==null||strA.length()!=strB.length()) return false;
	   char[] charsA = strA.toCharArray();
	   char[] charsB = strB.toCharArray();
       Arrays.sort(charsA);
       Arrays.sort(charsB);
	   return new String(charsA).equals(new String(charsB));
   }
   
   public static void main(String args[]) {
	   Solution1_3 so = new Solution1_3();
	   System.out.println(so.checkSam1("abcd", "dcba"));
   }
}
