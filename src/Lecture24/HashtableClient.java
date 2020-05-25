package Lecture24;

public class HashtableClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       HashTable<String, Integer> map=new HashTable<>(4);
       map.put("Russia",250);
       map.put("India", 300);
       map.display();
       map.put("USA", 150);
       map.display();
       map.put("NZ", 125);
       map.put("Aus", 175);
       map.display();
       map.put("China", 350);
       map.display();
       
//       System.out.println(map.get("India"));
//       System.out.println(map.get("Finland"));
//       
//       map.remove("USA");
//       map.display();
//       
       
       
	}

}
