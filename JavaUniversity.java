import java.util.Scanner;

public class JavaUniversity {

	Student  students;
	Course  courses;
	Scanner sc ;
	TestException expt;

	public void addCouse(Course course) throws CourseException {
	
	int cou= sc.nextInt();
	if(cou>5) {
		throw new CourseException();
	}
	for(int i =0; i<cou; i++) {
		course.setId(sc.nextInt());
		course.setName(sc.next());
		course.setClassRoom(sc.nextInt());
	}
		
	
}
		
		
	
	
	
	public void addStudent(Student student) throws TestException {
		int n= sc.nextInt();
		if(n>5) {
			throw new TestException();   
		}
		for(int i =0; i<n; i++) {
			student.setId(sc.nextInt()); 
			student.setName(sc.next());
			student.setGpa(sc.nextDouble());
		}
			
		
	}
	
	
	public void graduateStudent(Student student) throws IneligibleForGraduationException {
		if(student.getGpa() < 7.0d){
			throw new IneligibleForGraduationException ();
			}

		
	}
	
}
