package Lecture24;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxConseqSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 11, 4, 7, 2, 8 };
		System.out.println(maxlen(arr));
	}

	public static int maxlen(int[] arr) {
      HashMap<Integer, Boolean>map=new HashMap<>();
      for(int i=0;i<arr.length;i++) {
    	  int num=arr[i];
    	  int nm1=arr[i]-1;
    	  int np1=arr[i]+1;
    	  
    	  if(map.containsKey(nm1)) {
    		  map.put(num,false);
    	  }else {
    		  map.put(num, true);
    	  }
    	  
    	  if(map.containsKey(np1)) {
    		  map.put(np1, false);
    	  }
      }
      
      int maxlen=0;
      int startpoint=0;
      
      Set<Map.Entry<Integer,Boolean>> entries=map.entrySet();
      for(Map.Entry<Integer,Boolean> entry:entries) {
    	  if(entry.getValue()==false) {
    		  continue;
    	  }
    	  
    	  int currlen=0,currstartpoint=entry.getKey();
    	  
    	  while(map.containsKey(currstartpoint+currlen)) {
    		  currlen=currlen+1;
    	  }
    	  
    	  if(currlen>maxlen) {
    		  maxlen=currlen;
    	  }
      }
      
      return maxlen;
      
      
	}

}
