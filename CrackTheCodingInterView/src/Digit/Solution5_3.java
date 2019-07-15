package Digit;
/**
 *  最近的数
 * @author 86131
 *
 */
public class Solution5_3 {
    public int[] getCloseNumber(int x) {
    	int [] result = new int[2];
    	result[0] = getPrev(x);
    	result[1] = getNext(x);
        return result;
    }
    private int getPrev(int x) {
    	int tmp = x;
    	int c1 = 0;
    	int c0 = 0;
    	while((tmp&1)==1) {
    		c1++;
    		tmp >>=1;
    	}
    	while((tmp&1)!=1) {
    		c0++;
    		tmp >>=1;
    	}
    	tmp >>=1;
    	
    	tmp <<=(c1+c0+1);
    	tmp +=(1<<(c1+1))-1<<(c0-1);
    	return tmp;
    }
    private int getNext(int x) {
    	int tmp = x;
    	int c1 = 0;
    	int c0 = 0;
    	while((tmp&1)!=1) {
    		c0++;
    		tmp >>=1;
    	}
    	while((tmp&1)==1) {
    		c1++;
    		tmp >>=1;
    	}
    	tmp |=1;
    	tmp <<=(c1+c0);
    	tmp |= (1<<(c1-1))-1;
    	return tmp;
    }
    
    public static void main(String args[]) {
    	Solution5_3 so  = new Solution5_3();
    	int[] result = so.getCloseNumber(2);
    	for(int x:result) {
    		System.out.println(x);
    	}
    }
}
