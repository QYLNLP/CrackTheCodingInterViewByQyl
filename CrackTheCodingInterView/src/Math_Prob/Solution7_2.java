package Math_Prob;

public class Solution7_2 {
   public static double antsCollision(int n) {
	   
	   return 1-2.0/Math.pow(2,n);
   }
   
   public static void main(String args[]) {
	   System.out.println(antsCollision(3));
   }
}
