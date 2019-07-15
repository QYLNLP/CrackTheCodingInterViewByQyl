package Sort_Find;
/**
 * 叠罗汉1
 * @author 86131
 *  感觉标准答案有问题
 */
public class Solution11_7_1 {
    public static int getHeight(int[] men, int n) {
        if(men==null||n<0) return -1;
        int[] nums = new int[n];
        int max = 0;
        for(int i=0;i<n;i++) {
            nums[i] = 1;
        	for(int j=0;j<i;j++) {
        		if(men[i]>men[j])
        		      nums[i] = Math.max(nums[i],nums[j]+1);
        	}
        	System.out.println(i+"   "+nums[i]);
        	max = Math.max(nums[i], max);
        }
        return max;
    }
    
    public static int getHeight1(int[] men, int n)
    {
         
        int []dp=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++)
            {
                if(men[j]<=men[i])
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
    
    public static void main(String args[]) {
    	int[] men = {1,6,2,5,3,4};
    	int n = 6;
    	System.out.println(getHeight(men,n));
    }
}
