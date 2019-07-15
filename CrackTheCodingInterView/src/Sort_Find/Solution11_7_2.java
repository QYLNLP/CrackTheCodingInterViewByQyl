package Sort_Find;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 叠罗汉2
 * @author 86131
 *
 */
public class Solution11_7_2 {
    public int getHeight(int[][] actors, int n) {
    	if(actors==null||n<1) return 0;
    	Arrays.sort(actors,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[0]-o1[0];
			}  		
    	});
    	
    	int[] h = new int[n];
    	int max = 0;
    	for(int i=0;i<actors.length;i++) {
    		h[i] =1;
    		for(int j=0;j<i;j++) {
    			if(actors[i][0]<actors[j][0]&&actors[i][1]<actors[j][1]) {
    				h[i] = Math.max(h[i], h[j]+1);
    			}
    			max = Math.max(max, h[i]);
    		}
    	}
        return max;
    }
}
