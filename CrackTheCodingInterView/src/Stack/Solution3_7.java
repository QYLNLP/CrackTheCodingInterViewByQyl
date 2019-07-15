package Stack;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
/** 
 * 
 * @author 86131
 *
 */
public class Solution3_7 {
    public ArrayList<Integer> asylum(int[][] ope) {
    	if(ope==null||ope.length<1) return null; 
    	Queue<Integer> queueDog = new LinkedList<Integer>();
    	Queue<Integer> queueCat = new LinkedList<Integer>();
    	Queue<Integer> queueAll = new LinkedList<Integer>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0;i<ope.length;i++) {
    		switch(ope[i][0]) {
    		case 1:
    			if(ope[i][1]>0)
    				queueDog.add(ope[i][1]);
    			else
    				queueCat.add(ope[i][1]);
    			queueAll.add(ope[i][1]);
    			break;
    		case 2:
    			int animal;
    			if(ope[i][1]==0&&!queueAll.isEmpty())
    			{
    				animal = queueAll.poll();
    				if(animal>0)
    					queueDog.poll();
    				else
    					queueCat.poll();
    				list.add(animal);
    			}else if(ope[i][1]==1&&!queueDog.isEmpty()) {
    				animal = queueDog.poll();
                    queueAll.remove(animal);
                    list.add(animal);
    			}else if(ope[i][1]==-1&&!queueCat.isEmpty()){
    				animal = queueCat.poll();
                    queueAll.remove(animal);
                    list.add(animal);
    			}
    			break;
    		}
    	}
    	return list;
    }
}
