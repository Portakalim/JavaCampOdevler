
public class UserManager {
	public void add(User user) {
		System.out.println("Eklendi : " + user.mail);
	}
	
	public void update(User user) {
		System.out.println("G�ncellendi : " + user.mail);
	}
	
	public void delete(User user) {
		System.out.println("Silindi : " + user.mail);
	}
}
