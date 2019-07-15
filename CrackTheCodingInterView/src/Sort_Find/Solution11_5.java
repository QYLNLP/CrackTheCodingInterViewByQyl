package Sort_Find;

/**
 * 找出字符串
 * @author 86131
 *
 */
public class Solution11_5 {
    public int findString(String[] str, int n, String x) {
    	if(str==null||str==null||n<1) return -1;
    	
    	int start =0;
    	int end = n-1;
    	while(start<=end) {
    		//确定mid的值
    		int mid = (start+end)/2;
    		if(str[mid]==null) {
        		int left =mid-1;
        		int right  =mid+1;    		
        		while(str[left]==null&&str[right]==null) {
        			if(left<start&&right>end)
        				return -1;
        			left--;
        			right++;
        		}
        		mid = str[left]==null?right:left;		
    		}
    		
    		//比较
    		int value = str[mid].compareTo(x);
    		if(value==0)
    			return mid;
    		else if(value<0)
    			start =mid+1;
    		else
    			end = mid-1;

    	}
    	return -1;
    }
    public static void main(String args[]) {
    	Solution11_5 so = new Solution11_5();
    	String[] strs= {"","","CFWW","JUNMFCVE","KBVPO","LLQHRIN","P","RDDK","UFEYPGVKFO"};
    	int n = 9;
    	String x = "RDDK";
    	System.out.println(so.findString(strs, n, x));
    }
}
