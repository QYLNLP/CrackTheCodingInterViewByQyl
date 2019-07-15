package Sort_Find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/**
 *  变位词排序，且只保留变位词中的一个
 * @author 86131
 *
 */
public class Solution11_2 {
    public ArrayList<String> sortStrings(String[] str, int n) {
        ArrayList<String> res = new ArrayList<String>();
    	if(str==null||n<1) return res;
    	
         HashMap<String,String> map = new HashMap<String,String>();
         //桶排序变体
         for(String value:str) {
        	 String key = sortChars(value);
        	 if(map.get(key)==null||value.compareTo(map.get(key))<0)
        	        map.put(key, value);
         }
         
         res.addAll(map.values());
         Collections.sort(res);
    	 return res;
    }
    private String sortChars(String str) {
    	char[] chars = str.toCharArray();
    	Arrays.sort(chars);
    	return new String(chars);
    }
    
    public static void main(String args[]) {
    	String[] strs= {"a","ahgeomesgcehvk","am","awzccscrkozbhygrkvv","aytqutkugji","cslnzuenr","dwsddyelxywrxyfnz","emmaldzsvjggzfoda","emnetqjwnfwi","eonmenfkhmuaonnnumvk","flpkvoqz","ftytv","gbtcyuemud","gikvvynf","gjmqdrzqzjeemxxn","ixrhgkrnjs","izmvzrhltsiubcukc","kom","kpu","kwrwuwjvksyvhmrzfg","msnvvczxdgwm","nkktcebjirqvldz","nwxkeyhnvniquhpapw","pggunxuyduy","qdjzmdobajs","rdrrfuowxukryfmli","rrpujexoukmmrnmpdzcf","skmjhsm","ymysuotfxpboc"};
    	Solution11_2 so = new Solution11_2();
    	for(String str:so.sortStrings(strs, strs.length))
    		System.out.println(str);
    }
}
