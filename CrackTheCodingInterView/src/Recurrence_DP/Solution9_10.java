package Recurrence_DP;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
/**
 * 堆箱子
 * @author 86131
 *
 */
public class Solution9_10 {
	
    public int getHeight(int[] w, int[] l, int[] h, int n) {
    	if(w==null||l==null||h==null||n<1) return 0;
    	box[] boxes = new box[n]; 
    	for(int i =0;i<n;i++) {
    		boxes[i] = new box(w[i],l[i],h[i]);
    	}
    	return maxTower1(boxes,null,new HashMap<box,Integer>());
    }
    /**
     * 非递归动态规划
     * @param boxes
     * @param bottom
     * @param map
     * @return
     */
    private int maxTower1(box[] boxes,box bottom,HashMap<box,Integer> map) {
    	Arrays.sort(boxes,new Comparator<box>() {
			@Override
			public int compare(box o1, box o2) {
				return o2.w-o1.w;
			} 		
    	});
    	int[] h = new int[boxes.length];
    	int max = boxes[0].h;
    	h[0] = boxes[0].h;
    	for(int i=1;i<boxes.length;i++) {
    		int tmp = 0;
    		for(int j = 0;j<i;j++) {
    			if(boxes[i].w<boxes[j].w&&boxes[i].l<boxes[j].l)
    			    tmp = Math.max(tmp, h[j]);
    		}
            h[i] = tmp+boxes[i].h;
            max = Math.max(max, h[i]);
    	}
    	
    	return max;
    }
    /**
     * 递归+动态规划
     * @param boxes
     * @param bottom
     * @param map
     * @return
     */
    private int maxTower(box[] boxes,box bottom,HashMap<box,Integer> map) {
    	if(bottom!=null&&map.containsKey(bottom))
    		return map.get(bottom);
    	int max =0;
    	for(int i =0;i<boxes.length;i++) {
    		if(bottom==null||(bottom.w>boxes[i].w&&bottom.l>boxes[i].l)) {
    			int tmpMax = maxTower(boxes,boxes[i],map);
    			max = max>tmpMax?max:tmpMax;
    		}   			
    	}
    	int res = bottom==null?max:max+bottom.h;
        map.put(bottom, res);
        
    	return res;
    }
    class box{
    	int w,l,h;
    	public box(int w,int l,int h) {
    		this.w = w;
    		this.l = l;
    		this.h = h;
    	}
    }
    
    public static void main(String args[]) {
    	int[] w = {2768,542,832,844,2920,587,72,1724,447,809,672,2393,1235,2775,273,1165,1809,111,1263,2751,1068,2507,453,65,2338,1103,1093,2327,1995,1125,2340,1133,2123,1692,2215,140,1822,2144,2240,2916,1860,2226,698,846,2177,295};
    	int[] l = {821,2593,1581,2891,2853,1662,2747,2856,2178,865,383,523,809,998,312,237,1871,2730,823,676,568,1839,2063,1651,2704,2113,1316,2892,1874,270,1112,869,1099,1876,371,2298,2070,1514,2916,165,1043,1355,2852,1319,1979,1961};
    	int[] h = {771,2963,1599,1910,2317,2884,872,2463,949,341,2718,1500,1071,539,2463,1355,104,2989,1240,240,981,0,2172,3011,621,681,1178,2518,2766,615,460,2399,2443,2894,799,1726,2454,2099,2279,2911,2018,426,2896,224,2663,351};
    	Solution9_10 so = new Solution9_10();
    	System.out.println("h.length "+h.length);
    	System.out.println(so.getHeight(w, l, h, 46));
    }
}
