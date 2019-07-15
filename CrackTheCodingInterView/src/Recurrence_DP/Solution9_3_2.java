package Recurrence_DP;
/**
 * 重复序列
 * @author 86131
 *
 */
public class Solution9_3_2 {
    public boolean findMagicIndex(int[] A, int n) {
        if(A==null||n<1)
        	return false;
        return findMagicIndexCore(A,0,n-1);
    }
    private boolean findMagicIndexCore(int[] A,int start,int end) {
    	if(start>end||start<0||end>A.length-1)
    		return false;
    	
    	int mid = (start+end)/2;
    	if(A[mid]== mid)
    		return true;
    	int leftEnd = Math.min(mid-1, A[mid]);
    	int rightStart = Math.max(mid+1,A[mid]);
    	
    	return findMagicIndexCore(A,start,leftEnd)||findMagicIndexCore(A,rightStart,end);
    }
}
