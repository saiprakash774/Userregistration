package day5;

import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration 
{
	static Scanner input=new Scanner(System.in);
	public static String Entry() 
	{
		String Entry=input.next();
		return Entry;	
	}
	public boolean nameValidation(String Name)
	{ 
		String nameexpression= "^[A-Z][a-z]{2,}$";
		Pattern pattern=Pattern.compile(nameexpression);
		return pattern.matcher(Name).matches();
	}
	public boolean emailValidation(String Email) 
	{
		String email="^[a-zA-Z]+([\\d\\.\\+\\-][0-9a-zA-z]+)*@[\\da-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,3})*$";
		Pattern pattern=Pattern.compile(email);
		return pattern.matcher(Email).matches();
	}
	public  boolean mobileNumValidation(String Mobile) 
	{
		String mobile="^(\\d{2}( )?)?[6-9]{1}\\d{9}$";
		Pattern pattern=Pattern.compile(mobile);
		return pattern.matcher(Mobile).matches();
	}
	public boolean passwordValidation(String Password)
	{
		String password="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";
		Pattern pattern=Pattern.compile(password);
		return pattern.matcher(Password).matches();
	}
	public void checkName() 
	{
		while(true) 
		{
			String name=Entry();
			boolean check=nameValidation(name);
			if(check)
			{
				System.out.println("valid");
				break;
			}
			else 
				System.out.print("Invalid\nPlease Enter your valid name: ");
		}
	}
	public void checkEmail()
	{
		while(true)
		{
			String email=Entry();
			boolean check=emailValidation(email);
			if(check) 
			{
				System.out.println("valid");
				break;
			}
			else 
				System.out.print("Invalid\nPlease Enter your valid email id: ");
		}
	}
	public void checkMobileNumber() 
	{
		while(true)
		{
			String mobile=Entry();
			boolean check=mobileNumValidation(mobile);
			if(check)
			{
				System.out.println("valid");
				break;
			}
			else 
				System.out.print("Invalid\nPlease Enter your valid mobile number: ");
		}
	}
	private void checkPassword() 
	{
		while(true)
		{
			String password=Entry();
			boolean check=passwordValidation(password);
			if(check)
			{
				System.out.println("valid");
				break;
			}
			else 
				System.out.print("Invalid\nPlease Enter your valid password: ");
		}
	}
	public static void main(String[] args) 
	{
		UserRegistration userregistration= new UserRegistration();
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
