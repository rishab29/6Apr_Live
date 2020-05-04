package Lecture15;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] students=new Student[1000];
        
//        System.out.println(students[0]);
//        
//        students[0]=new Student("A",1);
//        System.out.println(students[0].getRollNo());
       
        
        
        for(int i=0;i<students.length;i++) {
        	students[i]=new Student(i+"th",i);
        	//System.out.println(students[i].getCurrentStudents());
        }
        
      //  System.out.println(students[250].getRollNo());
        
       System.out.println(students[250].getUniformColor());
       students[250].setUniformColor("White");
       
       System.out.println(students[300].getUniformColor());

        
       
       System.out.println(Student.UNIFORM_COLOR);
       
       
       Student.aStaticFunction();
       students[999].aStaticFunction();
       
       students[999].aNonStaticFunction();
        
        
        
        
        
	}

}
