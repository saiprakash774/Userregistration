package day5;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner input = new Scanner(System.in);

	public static String Entry() {
		String Entry = input.next();
		return Entry;
	}

	public boolean nameValidation(String Name) throws UserRegistrationException {
		Predicate<String> name = n ->  n.matches( "^[A-Z][a-z]{2,}$");
		if(name.test(Name))
			return true;
		else
			throw new UserRegistrationException("Please enter valid name");
	}

	public boolean emailValidation(String Email) throws UserRegistrationException {
		Predicate<String> email = n ->  n.matches("^[a-zA-Z]+([\\d\\.\\+\\-][0-9a-zA-z]+)*@[\\da-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,3})*$");
		if(email.test(Email))
			return true;
		else
			throw new UserRegistrationException("Please enter valid email id");
	}

	public boolean mobileNumValidation(String Mobile) throws UserRegistrationException {
		Predicate<String> mobile = n ->  n.matches ("^(\\d{2}( )?)?[6-9]{1}\\d{9}$");
		if(mobile.test(Mobile))
			return true;
		else
			throw new UserRegistrationException("Please enter valid mobile number");
	}

	public boolean passwordValidation(String Password) throws UserRegistrationException {
		Predicate<String> password = n ->  n.matches ("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$");
			if(password.test(Password))
				return true;
			else
				throw new UserRegistrationException("Please enter valid password");
	}

	public void checkName() {
		while (true) {
			try {
				String name = Entry();
				boolean check = nameValidation(name);
				if (check) {
					System.out.println("valid");
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
	}

	public void checkEmail() {
		while (true) {
			try {
				String email = Entry();
				boolean check = emailValidation(email);
				if (check) {
					System.out.println("valid");
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
	}

	public void checkMobileNumber() {
		while (true) {
			try {
				String mobile = Entry();
				boolean check = mobileNumValidation(mobile);
				if (check) {
					System.out.println("valid");
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}

		}
	}

	private void checkPassword() {
		while (true) {
			try {
				String password = Entry();
				boolean check = passwordValidation(password);
				if (check) {
					System.out.println("valid");
					break;
				}
			} catch (UserRegistrationException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		UserRegistration userregistration = new UserRegistration();
		System.out.print("Enter your First Name: ");
		userregistration.checkName();
		System.out.print("Enter your Last Name: ");
		userregistration.checkName();
		System.out.print("Enter your Email Id: ");
		userregistration.checkEmail();
		System.out.print("Enter your mobile number: ");
		userregistration.checkMobileNumber();
		System.out.print("Enter the Password: ");
		userregistration.checkPassword();

	}
}
