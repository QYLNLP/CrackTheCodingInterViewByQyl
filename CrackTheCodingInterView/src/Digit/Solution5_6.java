package Digit;
/**
 *  交换奇偶数位
 * @author 86131
 *
 */
public class Solution5_6 {
	/**
	 * 将偶数位取出并右移，将奇数位去除并左移
	 * @param x
	 * @return
	 */
    public int exchangeOddEven(int x) { 	
    	return ((x&0xaaaaaaaa)>>1)|((x&0x55555555)<<1);
    }
}
