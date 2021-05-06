
public class Homework {
	private int id;
	private String HomeworkName;
	private String Homeworkdetail;
	
	public Homework(int id, String homeworkName, String homeworkdetail) {
		super();
		this.id = id;
		HomeworkName = homeworkName;
		Homeworkdetail = homeworkdetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHomeworkName() {
		return HomeworkName;
	}

	public void setHomeworkName(String homeworkName) {
		HomeworkName = homeworkName;
	}

	public String getHomeworkdetail() {
		return Homeworkdetail;
	}

	public void setHomeworkdetail(String homeworkdetail) {
		Homeworkdetail = homeworkdetail;
	}
}
