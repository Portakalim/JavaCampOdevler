
public class Course {
	private int id;
	private String courseName;
	private String detail;
	
	public Course(int id, String courseName, String detail) {
		this.id = id;
		this.courseName = courseName;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
