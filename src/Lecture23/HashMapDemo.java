package Lecture23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, Integer> map=new HashMap<>();
      
      map.put("Russia",250);
      map.put("India", 300);
      map.put("USA", 150);
      System.out.println(map);
      
      map.put("India", 350);
      System.out.println(map);
      
      System.out.println(map.get("India"));
      System.out.println(map.get("NZ"));
      
//      map.remove("USA");
//      System.out.println(map);
      
      System.out.println(map.containsKey("India"));
      System.out.println(map.containsKey("NZ"));
      
      Set<String> keys=map.keySet();
      for(String key:keys) {
    	  System.out.println(key);
      }
      
      Collection<Integer> values=map.values();
      for(Integer value:values) {
    	  System.out.println(value);
      }
      
      Set<Map.Entry<String, Integer>> entries=map.entrySet();
      for(Map.Entry<String, Integer> entry:entries) {
    	  System.out.println(entry.getKey()+"=>"+entry.getValue());
      }
      
      String str="abbaadef";
      System.out.println(MaxFreq(str));
      
      int[] one= {3,1,5,6,7};
       int[] two= {2,1,4,6,8};
       System.out.println(getIntersection(one, two));
	
       int[] arr= {3,-5,-8,19,-1};
       
       System.out.println(subarraysumzero(arr));
	
	}
	
	public static char MaxFreq(String str) {
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char cc=str.charAt(i);
			if(map.containsKey(cc)) {
				int ov=map.get(cc);
				ov=ov+1;
				map.put(cc, ov);
			}else {
				map.put(cc, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entries=map.entrySet();
		char maxchar='\0';
		int maxfreq=0;
		
		for(Map.Entry<Character, Integer> entry:entries) {
			if(entry.getValue()>maxfreq) {
				maxchar=entry.getKey();
				maxfreq=entry.getValue();
			}
		}
		
		return maxchar;
		
	}
	
	public static ArrayList<Integer> getIntersection(int[] one,int[] two) {
		HashMap<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<one.length;i++) {
			map.put(one[i], false);
		}
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<two.length;i++) {
			if(map.containsKey(two[i])) {
				list.add(two[i]);
			}
		}
		
		return list;
	}
	
	public static boolean subarraysumzero(int[] arr) {
		HashMap<Integer, Boolean> map=new HashMap<>();
		int presum=0;
		
		for(int i=0;i<arr.length;i++) {
			presum=presum+arr[i];
			if(presum==0||map.containsKey(presum)) {
				return true;
			}else {
				map.put(presum, true);
			}
		}
		
		return false;
	}

}
