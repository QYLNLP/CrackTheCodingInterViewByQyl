package Recurrence_DP;
/**
 * 魔术索引2
 * @author 86131
 *
 */
public class Solution9_3_1 {
    public boolean findMagicIndex(int[] A, int n) {
    	if(A==null||n<1) return false;
    	int start =0;
    	int end = n-1;
    	while(start<=end) {
    	    int mid = (start+end)/2;
    		if(A[mid]==mid)
    			return true;
    		else if(A[mid]>mid)
    			end = mid -1;
    		else
    			start = mid +1;
    	}
        return false;
    }
}
