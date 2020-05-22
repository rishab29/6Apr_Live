package Lecture23;

public class GenericListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> l=new LinkedList<>();
      l.addLast("A");
      l.addLast("B");
      l.addLast("C");
      l.addLast("D");
      l.addLast("E");
      
      l.display();
      
      LinkedList<Integer> l2=new LinkedList<>();
      
      l2.addLast(1);
      l2.addLast(2);
      l2.addLast(3);
      l2.display();
      
      LinkedList<Student> s=new LinkedList<>();
      s.addLast(new Student("A", 1));
      s.addLast(new Student("B",2));
      s.addLast(new Student("C", 3));
      s.addLast(new Student("D", 4));
      
      s.display();
      
      Student tf=new Student("B", 100);
      System.out.println(s.find(tf));
      
	}
	
	public static class Student{
		String name;
		int rno;
		
		
		
		Student(String name,int rno){
			this.name=name;
			this.rno=rno;
		}
		
		public String toString() {
			return "{"+this.name+":"+this.rno+"}";
		}
		
		public boolean equals(Object other) {
			Student s=(Student)(other);
			return this.name.equals(s.name);
		}
		
	}

}
