

public class Main {

	public static void main(String[] args) {
		
		Courses course = new Courses(0, "Java", "Yeni baþlayanlar için Java eðitimi"); // referans oluþturma,intance
		Courses course2 = new Courses(1, "C#", "Yeni baþlayanlar için C# eðitimi");
		
		Homework homework = new Homework(0, "Java 1.gün ödevi", "1 ila 25 arasýndaki videolari izleyin");
		Homework homework2 = new Homework(1, "Java 2.gün ödevi", "25 ila 30 arasýndaki videolari izleyin");
		
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
