package Array_String;
/**
 *  ¾ØÕó·­×ª90¶È
 * @author 86131
 *
 */
public class Solution1_6 {
   public int[][] transformImage(int[][] mat,int n){
	   if(mat==null||mat.length<n||mat[0].length<n)
		   return mat;
	   
	   for(int i=0;i<n>>1;i++) {
		   int first = i;
		   int last = n-1-first;
		   for(int j = first;j<last;j++) {
			   int step = j-first;
			   int temp = mat[first][j];
			   mat[first][j] = mat[last-step][first];
			   mat[last-step][first] = mat[last][last-step];
			   mat[last][last-step] = mat[j][last];
			   mat[j][last] = temp;  
		   }
	   }
	   return mat;   
   }
}
