package Digit;
/**
 *  像素设定
 * @author 86131
 *  与程序员面试宝典中的原题相差较大
 */
public class Solution5_8 {
    public int[] renderPixel(int[] screen, int x, int y) {
        for(int i=x;i<y;i++) {
        	int k = i%8;
        	int l = i/8;
        	screen[l] |= (1<<k);
        }
    	return screen;
    }
}
