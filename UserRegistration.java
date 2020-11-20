package day5;

import java.util.Scanner;

public class UserRegistration 
{
	public static void checkName()
	{
		String pattern= "^[A-Z][a-z]{2,}$";
		Scanner input=new Scanner(System.in);
		String name=input.next();
		if(name.matches(pattern))
			System.out.println("valid");
		else
		{
			System.out.println("Invalid\nEnter your name again");
			checkName();
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your First Name :");
		checkName();
		System.out.println("Enter your Last Name :");
		checkName();
	}
}
