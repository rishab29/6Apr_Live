package Lecture15;

public class Person {
    
	private String name;
	private int age;
	
	
	
	Person(){
		System.out.println("Hi Everyone");
	}
	
//	Person(int age,String name){
//		this.age=age;
//		this.name=name;
//	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age<0) {
			return;
		}
		this.age=age;
	}
	
	

}
