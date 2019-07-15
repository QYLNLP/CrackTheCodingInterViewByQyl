package Digit;
/**
 *  二进制小数
 * @author 86131
 *
 */
public class Solution5_2 {
    public static String  printBin(double num) {
    	if(num>=1||num<=0)
    		return "Error";
    	StringBuilder sb = new StringBuilder();
    	sb.append("0.");
    	while(num>0) {
    		if(sb.length()>=32)
    			return "Error";
    		num = num*2;
    		int temp = num>=1?1:0;//等于1时也需要将该小数位设置为1
    	    sb.append(temp);
    	    num = num>=1?num-1:num;//等于1时也需要将该小数位设置为1
    	}
    	return sb.length()==32?"ERROR":sb.toString();
    }
    public static void main(String args[]) {
    	System.out.println(printBin(0.03125));
    }
}
