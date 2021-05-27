package fifthDayHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fifthDayHomework.business.abstracts.UserService;
import fifthDayHomework.core.GoogleService;
import fifthDayHomework.dataAccess.abstracts.UserDao;
import fifthDayHomework.entities.concretes.User;

public class UserManager implements UserService{

	private List<String> emailList = new ArrayList<String>();
	private List<String> passwordList = new ArrayList<String>();
	
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao=userDao;
		this.googleService=googleService;
			
	}
	
	public boolean isEmailValid(String email) {
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
		
		}
	
	public boolean isEmailValidOnClick(String email) {
		return true;
	}

	@Override
	public void register(User user) {
		
		if (user.getPassword().length() < 6 || user.getPassword() == null) {
			System.out.println("Parolan�z en az 6 karakterden olu�mal�d�r");
			return;
		}
		if (emailList.contains(user.getEmail())) {
			System.out.println("Bu email daha �nce kullan�ld�");
			return;
		}
		if (user.getName().length() < 3 || user.getLastName().length() < 3) {
			System.out.println("Ad ve soyad en az 3 karakterden olu�mal�d�r");
			return;
		}else {
			System.out.println("Do�rulama linkini " + user.getEmail() + " mail adresine g�nderildi");
		}
		
		if (isEmailValid(user.getEmail())) {
			System.out.println("Kay�t i�lemi tamamland�");
			emailList.add(user.getEmail());
			passwordList.add(user.getPassword());
			this.userDao.add(user);
			this.googleService.registerToSystem("Eri�im Verildi");
		
		}else {
			
			System.out.println("Hesap bilgilerinizi kontrol ediniz");
			
		}
		
	}

	@Override
	public void login(String email, String password) {
		
		if(emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Sisteme giri� ba�ar�l�");
		} 
		else {
			System.out.println("Email veya parolan�z hatal�. L�tfen kontrol ediniz.");
		}
		
		
	}
}	