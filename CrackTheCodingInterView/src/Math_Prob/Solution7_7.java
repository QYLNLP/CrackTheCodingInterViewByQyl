package Math_Prob;
/**
 *  第k个数
 * @author 86131
 *
 */
public class Solution7_7 {
     public static int getKth(int k) {
    	 int[] array = new int[k];
    	 array[0] = 3;
    	 array[1] = 5;
    	 array[2] = 7;
    	 int Num3=0;
    	 int Num5=0;
    	 int Num7=0;
    	 for(int n=3;n<k;n++) {
    		 array[n] = Math.min(Math.min(array[Num3]*3, array[Num5]*5), array[Num7]*7);
    		 if(array[n] == array[Num3]*3) Num3++;
    		 if(array[n] == array[Num5]*5) Num5++;
    		 if(array[n] == array[Num7]*7) Num7++;
    		 
    	 }
    	 return array[k-1];
     }
     public static  void main(String args[]) {
    	 System.out.println(getKth(4));
     }
}
