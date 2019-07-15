package Array_String;
/**
 *       ȷ���ַ�����
 * @author 86131
 *
 */
public class Solution1_1 {
	/**
	 *  ������ʵ��hashMap,ʹ�ö���Ĵ洢�ռ�
	 * @param iniString
	 * @return
	 */
   public boolean checkDifferent(String iniString) {
	   if(iniString==null||iniString.length()>256) return false;
	   
	   boolean[] chars = new boolean[256];
	   for(int i=0;i<iniString.length();i++) {
		   int index = iniString.charAt(i);
		   if(chars[index])
			   return false;
		   chars[index] = true;
	   }
	   return true;
   }
   
   /**
    *  ��ռ�ö���Ĵ洢�ռ�
    * @param iniString
    * @return
    */
   public boolean checkDifferent2(String iniString) {
	   if(iniString==null||iniString.length()>256)  return false;
	   
	   for(int i=0;i<iniString.length();i++) {
		   int ch = iniString.charAt(i);
		   for(int j=i+1;j<iniString.length();j++) {
			   if(ch==iniString.charAt(j))
				   return false;
		   }
	   }
	   return true;
   }
   /**
    *   ȫ����ĸʱ�����ã���Ȼλ������
    * @param str
    * @return
    */
   public boolean checkDifferent1(String str) {
	   if(str==null||str.length()>26) return false;
	   
	   int checker = 0;
	   for(int i=0;i<str.length();i++) {
		   int val = str.charAt(i);
		   System.out.println("val = "+val);
		   if((checker&(1<<val))>0) 
			   return false;
		   checker |= (1<<val);
	   }
	return true;
   }
   public static void main(String args[]) {
	   Solution1_1 so = new Solution1_1();
	   System.out.println(so.checkDifferent2("acbdbesy"));
   }
}
