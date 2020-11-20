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
		String pattern="^([a-zA-Z\\.]+)([a-zA-Z]+)@([a-z]+)\\.([a-zA-Z\\.]{2,5})$";
		System.out.println("Enter you Email  Id");
		String email=input.next();
		if(email.matches(pattern))
			System.out.println("Valid Email Id");
		else 
		{
			System.out.println("Invalid Email Id");
			emailValidation();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your First Name :");
		checkName();
		System.out.println("Enter your Last Name :");
		checkName();
		emailValidation();
	}
}
