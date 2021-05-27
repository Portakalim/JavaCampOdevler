package fifthDayHomework.dataAccess.concretes;

import java.util.List;

import fifthDayHomework.dataAccess.abstracts.UserDao;
import fifthDayHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getName() + user.getLastName() + " adlý kullanýcý eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + user.getLastName() + " adlý kullanýcý güncellendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + user.getLastName() + " adlý kullanýcý silindi");
		
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
