import java.util.ArrayList;

public class EmailSystem {

	ArrayList<String> usersNew = new ArrayList();
	ArrayList<String> namesNew = new ArrayList();
	ArrayList<String> passwordsNew = new ArrayList();
	
	
	//constructor pass through
	public EmailSystem() {
		
	}
	


	//register new user method
	public void newUserAccount(String name, String user, String pass) {
		usersNew.add(user);
		namesNew.add(name);
		passwordsNew.add(pass);
	}
	
	
	
	//list all users registered method
	public void PlusallNewUsers() {
		for(String i : usersNew) {
			System.out.println(i);
		}
	}
	
	
}
