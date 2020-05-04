package Lecture15;

public class Student {

	private String name;
	private final int rollno;
	
	public static int MAX_STUDENTS=1000;
	private static int CURRENT_STUDENTS=0;
	
	public static String UNIFORM_COLOR="Blue";

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
		Student.CURRENT_STUDENTS++;
	}
	
	public int getCurrentStudents() {
		return Student.CURRENT_STUDENTS;
	}
	
	
	public void setUniformColor(String color) {
		Student.UNIFORM_COLOR=color;
	}
	
	public String getUniformColor() {
		return Student.UNIFORM_COLOR;
	}
	
	
	public int getRollNo() {
		return this.rollno;
	}
	
	public void setRollNo(int age) {
		if(age<0) {
			return;
		}
	//	this.rollno=rollno;
	}
	
	
	public static void aStaticFunction() {
		System.out.println(Student.UNIFORM_COLOR);
	}
	
	public void aNonStaticFunction() {
		System.out.println(this.name+" has unifrom color "+Student.UNIFORM_COLOR);
	}

}
