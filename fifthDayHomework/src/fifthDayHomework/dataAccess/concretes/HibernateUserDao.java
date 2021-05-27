package fifthDayHomework.dataAccess.concretes;

import java.util.List;

import fifthDayHomework.dataAccess.abstracts.UserDao;
import fifthDayHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName() + user.getLastName() + " adl� kullan�c� eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + user.getLastName() + " adl� kullan�c� g�ncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + user.getLastName() + " adl� kullan�c� silindi");
		
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
