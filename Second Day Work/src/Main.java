

public class Main {

	public static void main(String[] args) {
		
		Courses course = new Courses(0, "Java", "Yeni ba�layanlar i�in Java e�itimi"); // referans olu�turma,intance
		Courses course2 = new Courses(1, "C#", "Yeni ba�layanlar i�in C# e�itimi");
		
		Homework homework = new Homework(0, "Java 1.g�n �devi", "1 ila 25 aras�ndaki videolari izleyin");
		Homework homework2 = new Homework(1, "Java 2.g�n �devi", "25 ila 30 aras�ndaki videolari izleyin");
		
		Courses[] courses = {course,course2};
		
		for (Courses courses1 : courses) {

			System.out.println(courses1.getCourseName());

		}
		
		Homework[] homeworks = {homework, homework2};
		
		for (Homework homework1 : homeworks) {
			System.out.println(homework1.getHomeworkName());
		}
		
		CourseManager CourseManager = new CourseManager();
		CourseManager.AddaCourse(course);
		
		CourseManager.AddaCourse(course2);
	}

}
