package day5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner input = new Scanner(System.in);

	public static String Entry() {
		String Entry = input.next();
		return Entry;
	}

	public boolean nameValidation(String Name) throws UserRegistrationException {
		String nameexpression = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(nameexpression);
		if(pattern.matcher(Name).matches())
			return true;
		else
			throw new UserRegistrationException("Please enter valid name");
	}

	public boolean emailValidation(String Email) throws UserRegistrationException {
		String email = "^[a-zA-Z]+([\\d\\.\\+\\-][0-9a-zA-z]+)*@[\\da-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,3})*$";
		Pattern pattern = Pattern.compile(email);
		if(pattern.matcher(Email).matches())
			return true;
		else
			throw new UserRegistrationException("Please enter valid email id");
	}

	public boolean mobileNumValidation(String Mobile) throws UserRegistrationException {
		String mobile = "^(\\d{2}( )?)?[6-9]{1}\\d{9}$";
		Pattern pattern = Pattern.compile(mobile);
		if(pattern.matcher(Mobile).matches())
			return true;
		else
			throw new UserRegistrationException("Please enter valid mobile number");
	}

	public boolean passwordValidation(String Password) throws UserRegistrationException {
		String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		Pattern pattern = Pattern.compile(password);
			if(pattern.matcher(Password).matches())
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
