package Tree_Graph;

public class Solutio4_7 {
    public int getLCA(int a, int b) {
        if(a<1||b<1)
        	return -1;
        int i=a,j=b;
        while(i!=j) {
        	if(i>j) {
        		i>>=1;       		
        	}
            else if(i<j){
            	j>>=1;
            }
        }
        return i;
    }
}
