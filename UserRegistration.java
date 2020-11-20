package day5;

import java.util.Scanner;

public class UserRegistration 
{
	static Scanner input=new Scanner(System.in);
	public static void checkName()
	{
		String pattern= "^[A-Z][a-z]{2,}$";
		
		String name=input.next();
		if(name.matches(pattern))
			System.out.println("valid");
		else
		{
			System.out.println("Invalid\nEnter your name again");
			checkName();
		}
	}
	public static void emailValidation() 
	{
		String pattern="^[a-zA-Z]+([\\d\\.\\+\\-][0-9a-zA-z]+)*@[\\da-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,3})*$";
		System.out.println("Enter your Email  Id");
		String email=input.next();
		if(email.matches(pattern))
			System.out.println("Valid Email Id");
		else 
		{
			System.out.println("Invalid Email Id");
			emailValidation();
		}
	}
	public static void mobileNumValidation() {
		String pattern="^([\\*]?91)[6-9]{1}[\\d]{9}$";
		System.out.println("Enter your mobile number");
		String mobile=input.next();
		if(mobile.matches(pattern))
			System.out.println("Valid Mobile number");
		else
		{
			System.out.println("Invalid Mobile number");
			mobileNumValidation();
		}
	}
	public static void passwordValidation() {
		String pattern="^.(?=.*[A-Z]+)(?=.*[\\d])(?=.*[@#$%^&+=])([A-Za-z\\d]{7,20}).$";
		System.out.println("Enter the Password:");
		String password=input.next();
		if(password.matches(pattern))
			System.out.println("valid password");
		else
		{
		System.out.println("Invalid Password:");
		passwordValidation();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your First Name :");
		checkName();
		System.out.println("Enter your Last Name :");
		checkName();
		emailValidation();
		mobileNumValidation();
		passwordValidation();
	}
}
