import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class User {
	
	private String name;
	private String user;
	private String pass;
	
	ArrayList<String> users = new ArrayList();
	ArrayList<String> names = new ArrayList();
	ArrayList<String> passwords = new ArrayList();
	
	ArrayList<String> emails_SENT = new ArrayList();
	
	//constructor
	public User(String name, String user, String pass) {
		this.name = name;
		this.user = user;
		this.pass = pass;
	}

	//getter name
	public String getName() {
		return name;
	}
	
	//getter user
	public String getUser() {
		return user;
	}
	
	//getter pass
	public String getPass() {
		return pass;
	}
	
	//mutator name
	public void setName() {
		String setName = JOptionPane.showInputDialog("Enter new name: ");
		this.name = setName;
	}
	
	//mutator user
	public void setUser() {
		String setUser = JOptionPane.showInputDialog("Enter new username: ");
		this.user = setUser;
	}
	
	//mutator pass
	public void setPass() {
		String setPass = JOptionPane.showInputDialog("Enter new password: ");
		this.pass = setPass;
		
	}
	
	//List Adder for this class
	public void adder() {
		users.add(this.user);
		names.add(this.name);
		passwords.add(this.pass);
	}
	
	//iterate the main user in this class
	public void iterateMainUser() {
		System.out.println("Registered user list:");
		for(String i : users) {
			System.out.println(i);
		}
		
	}
	
	//check login method, I'm having trouble as to why it keeps coming out as one result
	public boolean check(String checkUser, String checkPass) {
		boolean passCheck;
		if((checkUser.contentEquals(user) && checkPass.contentEquals(pass))== true) {
			passCheck = true;
		} else {
			
			passCheck = false;
		}
		
		return passCheck;
		
	}
	
	
	public void sendEmail() {
		IndividualEmail userInt = new IndividualEmail("John", "Smith", "Hey, how are you doing? I had a good trip and did a lot of stuff in NYC. ");
		
		emails_SENT.addAll((Collection<? extends String>) userInt);
		
	}
	
}
