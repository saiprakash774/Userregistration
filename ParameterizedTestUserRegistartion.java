package day5;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTestUserRegistartion 
{
	private String email;
	private boolean expectedresult;
	private UserRegistration userregistration;
	
	@Before
	public void initialize()
	{
		userregistration=new UserRegistration();
	}
	
	public ParameterizedTestUserRegistartion(String email,boolean expectedresult) 
	{
		this.email=email;
		this.expectedresult=expectedresult;
	}
	
	@Parameterized.Parameters
    public static Collection input() 
	{
		return Arrays.asList(new Object[][] { { "abc@Yahoo.com", true}, { "abc-100@yahoo.com", true}, 
		{ "abc.100@Yahoo.com", true}, { "abc111@abc.net", true}, 
		{ "abc-100@abc.net", true}, { "abc.100@abc.com.au", true}, 
		{ "abc@1.com", true}, { "abc@gmail.com.com", true}, { "abc+100@gmail.com", true}, { "abcYahoo.com", false},
		{ "abcYahoo.com", false}, { "abc@.com.my", false}, { "abc123@gmail.a", false}, { "abc123@.com",false}, 
		{ "abc123@.com.com", false}, { ".abc@abc.com", false}, { "abc()*@gmail.com", false}, { "abc@%*.com", false}, 
		{ "abc..2002@gmail.com", false}, { "abc.@gmail.com", false}, {"abc@gmail.com.1a", false} });
	}
	
	@Test
	public void paramerizedtestuserregistion()
	{
		try {
			assertEquals(expectedresult,userregistration.emailValidation(email));
		} catch (UserRegistrationException e) {
			System.out.println(e);
		}
	}
}