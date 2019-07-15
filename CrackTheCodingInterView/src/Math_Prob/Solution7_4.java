package Math_Prob;

/**
 * 加法替代运算
 * 
 * @author 86131
 *
 */
public class Solution7_4 {
	public int calc(int a, int b, int type) {
		if (type == -1) {
			return (~b) + 1 + a;
		} else if (type == 1) {
			int res = a;
			for (int k = 1; k < b; k++) {
				res += a;
			}
			return res;
		} else if (type == 0) {
			int nums = 0;
			int count = 0;
			while (nums != a) {
				nums += b;
				count++;
			}
			return count;
		}
		return -1;
	}

	public static void main(String args[]) {
		for (int k = 1; k < 1; k++) {
			System.out.println("第一次没有进行条件判断");
		}
		System.out.println((~5) + 1);
	}
}
