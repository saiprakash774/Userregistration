package day5;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration 
{
	UserRegistration userregistration= new UserRegistration();
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		boolean result = userregistration.nameValidation("Sai");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		boolean result = userregistration.nameValidation("Sa");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		boolean result = userregistration.nameValidation("S@iPr@k@sh");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		boolean result = userregistration.nameValidation("Prakash");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		boolean result = userregistration.nameValidation("Sa");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		boolean result = userregistration.nameValidation("Pr@k@sh");
		Assert.assertEquals(false, result);
	}
	@Test
	public void validateEmailAddress_WhenValid_ShouldReturnTrue() {
		boolean result = userregistration.emailValidation("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}
	@Test
	public void validateMobile_Whenwithcountrycode_Space_Num_ShouldReturnTrue() {
		boolean result =userregistration.mobileNumValidation("91 9638527410");
		Assert.assertEquals(true, result);
	}
	@Test
	public void validatePassword_withmin8char_withallconditions_ShouldReturnTrue() {
		boolean result =userregistration.passwordValidation("Svjjhj24@ufv");
		Assert.assertEquals(true, result);
	}
	@Test
	public void validatePassword_withoutmin8char_ShouldReturnFalse() {
		boolean result =userregistration.passwordValidation("s1@as");
		Assert.assertEquals(false, result);
	}
	@Test
	public void validatePassword_withoutUppercase_ShouldReturnFalse() {
		boolean result =userregistration.passwordValidation("sai@12345");
		Assert.assertEquals(false, result);
	}
	@Test
	public void validatePassword_withoutNumeric_ShouldReturnFalse() {
		boolean result =userregistration.passwordValidation("sai@prakash");
		Assert.assertEquals(false, result);
	}
}