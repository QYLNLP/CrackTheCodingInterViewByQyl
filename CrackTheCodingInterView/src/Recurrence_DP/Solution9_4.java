package Recurrence_DP;

import java.util.ArrayList;

/**
 * 集合的子集
 * @author 86131
 *
 */
public class Solution9_4 {
    public static ArrayList<ArrayList<Integer>> getSubsets(int[] A,int n){
    	ArrayList<ArrayList<Integer>> dList = new ArrayList<ArrayList<Integer>>();
    	if(A==null||n<1)
    		return dList;

    	return  getSubSetsCore(A,n-1);
    }
    private static ArrayList<ArrayList<Integer>> getSubSetsCore(int[] A, int index) {
    	ArrayList<ArrayList<Integer>> newdLists = new ArrayList<ArrayList<Integer>>();
    	if(index<0)
    	   return  newdLists;
    	
    	ArrayList<ArrayList<Integer>> dList1 =getSubSetsCore(A,index-1);
    	for(ArrayList<Integer> list : dList1) {
    		ArrayList<Integer> newList = new ArrayList<Integer>();
    		newList.add(A[index]);
    		newList.addAll(list);
    		newdLists.add(newList);
    	}
    	ArrayList<Integer> newList = new ArrayList<Integer>();
    	newList.add(A[index]);
    	newdLists.add(newList);
    	
    	newdLists.addAll(dList1);
        return newdLists;
    }
    
    public static void main(String args[]) {
    	int[] array = {123,456,789};
    	ArrayList<ArrayList<Integer>> dList = getSubsets(array,3);
    	for(ArrayList<Integer> list:dList) {
    		System.out.println();
    		for(Integer num:list)
    			System.out.print(num+" ");
    	}
    }
}
