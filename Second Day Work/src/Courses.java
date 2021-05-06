
public class Courses {
	private int id;
	private String CourseName;
	private String detail;
	
	public Courses(int id, String courseName, String detail) {
		super();
		this.id = id;
		CourseName = courseName;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
