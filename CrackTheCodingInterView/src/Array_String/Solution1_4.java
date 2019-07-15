package Array_String;
/**
 *   string replaceSpace
 * @author 86131
 *
 */
public class Solution1_4 {
      public String replaceSpace(String iniString, int length) {
    	  if(iniString==null||iniString.length()<1) return iniString;
    	  int count =0;
    	  for(int i=0;i<iniString.length();i++) {
    		  if(iniString.charAt(i) == ' ')
    			  count++;
    	  }
    	  int len = iniString.length()+count*2;
    	  char[]  chars =new char[len];
    	  len--;
    	  for(int i=iniString.length()-1;i>=0;i--) {
    		  if(iniString.charAt(i) == ' ') {
    			  chars[len--] ='0';
    			  chars[len--] ='2';
    			  chars[len--] ='%';
    		  }
    		  else {
    			  chars[len--] = iniString.charAt(i);
    		  }
    	  }
    	  return new String(chars);
      }
      
      public static void main(String args[]) {
    	  Solution1_4 so = new Solution1_4();
    	  System.out.println(so.replaceSpace("qqw",3));
      }
}
