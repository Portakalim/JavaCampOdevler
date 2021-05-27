package fifthDayHomework;

import fifthDayHomework.business.concretes.UserManager;
import fifthDayHomework.core.GoogleAdapter;
import fifthDayHomework.dataAccess.concretes.HibernateUserDao;
import fifthDayHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAdapter());
		User user1 = new User(1,"Ali","Kutluay","ali@gmail.com","123456");
		userManager.register(user1);
		userManager.login("ali@gmail.com", "123456");
		

	}

}
