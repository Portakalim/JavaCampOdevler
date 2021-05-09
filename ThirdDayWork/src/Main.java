
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.mail = "engin@gmail.com";

		
		Student student = new Student();
		student.id=1;
		student.firstName="Ali Furkan";
		student.lastName="Kutluay";
		student.mail="ali@gmail.com";

		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
	}

}
