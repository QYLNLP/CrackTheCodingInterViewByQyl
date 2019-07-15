package Recurrence_DP;
/**
 * 硬币表示
 * @author 86131
 *
 */
public class Solution9_8 {
      public static int CountWays(int n) {
    	  if(n<1) return 0;
    	  int[] coin = {1,5,10,25};
    	  int[] dp =new int[n+1];
    	  dp[0]= 1;
    	  for(int i= 0;i<coin.length;i++) {
    		  for(int j=coin[i];j<=n;j++) {
    			  dp[j] =(dp[j]+dp[j-coin[i]])%1000000007;
    		  }
    	  }
    	  return dp[n];
      }
      
      public static void main(String args[]) {
    	  System.out.println(CountWays(6));
      }
}
