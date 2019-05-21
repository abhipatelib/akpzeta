import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;


public class Email {
	
	public static void main(String args[]) {
		
		//first user set user info
		User main = new User(null,null,null);
		main.setName();
		main.setUser();
		main.setPass();
		main.adder();
		//program login process
		String username, password;
		User userOne = new User("", "", "");
		EmailSystem driver = new EmailSystem();
		
		
		
		int loginOrRegister;
		
		do {
			loginOrRegister = JOptionPane.showConfirmDialog(null, "Would you like to login or register? (Yes to login, no to register)");
		if(loginOrRegister == 0) {
			username = JOptionPane.showInputDialog("Enter username: ");
			password = JOptionPane.showInputDialog("Enter password: ");
			
			if(userOne.check(main.getUser(), main.getPass()) == true) {
				JOptionPane.showMessageDialog(null, "Login successful.");
			} else if(userOne.check(main.getUser(), main.getPass()) == false){
				JOptionPane.showMessageDialog(null, "Login not successful.");
			}
		
		} else if (loginOrRegister == 1) {
			String nameOfNew = JOptionPane.showInputDialog("Enter full name of User: ");
			String userOfNew = JOptionPane.showInputDialog("Enter new username: ");
			String passOfNew = JOptionPane.showInputDialog("Enter new password for account: ");
			driver.newUserAccount(nameOfNew, userOfNew, passOfNew);
			JOptionPane.showMessageDialog(null, "User has been successfully registered.");
			
			
		} 
		} while (loginOrRegister != 2);
		
		
		
		
		main.iterateMainUser(); driver.PlusallNewUsers();
		
		
		
	}
	
}
