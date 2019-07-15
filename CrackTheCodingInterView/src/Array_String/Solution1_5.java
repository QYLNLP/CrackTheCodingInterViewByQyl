package Array_String;
/**
 *      ×Ö·û´®×ª»»
 * @author 86131
 *
 */
public class Solution1_5 {
     public String zipString(String str) {
    	 if(str==null||str.length()<2) return str;
    	 
    	 StringBuffer sb = new StringBuffer();
    	 for(int i=0;i<str.length();) {
    		 char ch = str.charAt(i);
    		 int count =0;
    		 while(i<str.length()&&ch==str.charAt(i)) {
    			 count++;
    			 i++;
    		 } 
    		 sb.append(ch);
    		 sb.append(count);
    	 }
    	 return sb.toString().length()>str.length()?str:sb.toString();
     }
     public static void main(String args[]) {
    	 Solution1_5 so = new Solution1_5();
    	 System.out.println(so.zipString("qwssss"));
     }
}
