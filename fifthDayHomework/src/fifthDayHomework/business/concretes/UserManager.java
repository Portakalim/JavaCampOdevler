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
			System.out.println("Parolanýz en az 6 karakterden oluþmalýdýr");
			return;
		}
		if (emailList.contains(user.getEmail())) {
			System.out.println("Bu email daha önce kullanýldý");
			return;
		}
		if (user.getName().length() < 3 || user.getLastName().length() < 3) {
			System.out.println("Ad ve soyad en az 3 karakterden oluþmalýdýr");
			return;
		}else {
			System.out.println("Doðrulama linkini " + user.getEmail() + " mail adresine gönderildi");
		}
		
		if (isEmailValid(user.getEmail())) {
			System.out.println("Kayýt iþlemi tamamlandý");
			emailList.add(user.getEmail());
			passwordList.add(user.getPassword());
			this.userDao.add(user);
			this.googleService.registerToSystem("Eriþim Verildi");
		
		}else {
			
			System.out.println("Hesap bilgilerinizi kontrol ediniz");
			
		}
		
	}

	@Override
	public void login(String email, String password) {
		
		if(emailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Sisteme giriþ baþarýlý");
		} 
		else {
			System.out.println("Email veya parolanýz hatalý. Lütfen kontrol ediniz.");
		}
		
		
	}
}	