package Recurrence_DP;
/**
 * 上楼梯
 * @author 86131
 *
 */
public class Solution9_1 {
      public static int countWays(int n) {     
    	  if(n==1) return 1;
    	  if(n==2) return 2;
    	  if(n==3) return 3;
    	  
    	  int[] array = new int[n];
    	  array[0] = 1;
    	  array[1] = 2;
    	  array[2] = 4;
    	  for(int i =3;i<n;i++) {
    		  array[i] = ((array[i-1]+array[i-2])%1000000007+array[i-3])%1000000007;
    	  }
    	  return array[n-1];
      }
      public static void main(String args[]) {
    	  System.out.println(countWays(36196));
      }
}