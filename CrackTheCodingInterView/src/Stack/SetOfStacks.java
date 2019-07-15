package Stack;
import java.util.ArrayList;
/**
 *  集合栈
 * @author 86131
 *
 */
public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        ArrayList<ArrayList<Integer>> sos  = new ArrayList<ArrayList<Integer>>();
        if(ope.length<1||size<1) return sos;
        
        ArrayList<Integer> inner = new ArrayList<Integer>();
        sos.add(inner);
        for(int i=0;i<ope.length;i++) {
        	inner = sos.get(sos.size()-1);
        	switch(ope[i][0]) {
        	case 1:
        		if(inner.size()<size)
        			inner.add(ope[i][1]);
        		else {
        			inner = new ArrayList<Integer>();
        			inner.add(ope[i][1]);
        			sos.add(inner);
        		}
        		break;
            case 2:
            	if(sos.get(0).size()==0)
            		continue;
            	if(inner.size()<1) {
                    sos.remove(sos.size()-1);
            		inner = sos.get(sos.size()-1);
            	}
        		inner.remove(inner.size()-1);
        	}
        }
    	return sos; 
    }
}