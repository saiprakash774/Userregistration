package day5;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
	UserRegistration userregistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		try {
			Assert.assertTrue(userregistration.nameValidation("Sai"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		try {
			userregistration.nameValidation("Sa");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid name", e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
		try {
			userregistration.nameValidation("S@iPr@k@sh ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid name", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		try {
			Assert.assertTrue(userregistration.nameValidation("Prakash"));
		} catch (UserRegistrationException e) {
		}
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		try {
			userregistration.nameValidation("Sa");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid name", e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenWithSpChars_ShouldReturnFalse() {
		try {
			userregistration.nameValidation("S@iPr@k@sh ");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid name", e.getMessage());
		}
	}

	@Test
	public void validateEmailAddress_WhenValid_ShouldReturnTrue() {
		try {
			userregistration.emailValidation("abc.xyz@bl.co.in");
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void validateEmailAddress_WhennotValid_ShouldReturnFalse() {
		try {
			userregistration.emailValidation("abcYahoo.com");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid email id", e.getMessage());
		}
	}

	@Test
	public void validateMobile_Whenwithcountrycode_Space_Num_ShouldReturnTrue() {
		try {
			userregistration.mobileNumValidation("91 9638527410");
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void validateMobile_Numberlessthan10_ShouldReturnFalse() {
		try {
			userregistration.mobileNumValidation("963852741");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid mobile number", e.getMessage());
		}
	}

	@Test
	public void validatePassword_withmin8char_withallconditions_ShouldReturnTrue() {
		try {
			userregistration.passwordValidation("Svjjhj24@ufv");
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void validatePassword_withoutmin8char_ShouldReturnFalse() {
		try {
			userregistration.passwordValidation("s1@as");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid password", e.getMessage());
		}

	}

	@Test
	public void validatePassword_withoutUppercase_ShouldReturnFalse() {
		try {
			userregistration.passwordValidation("sai@12345");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid password", e.getMessage());
		}
	}

	@Test
	public void validatePassword_withoutNumeric_ShouldReturnFalse() {
		try {
			userregistration.passwordValidation("sai@prakash");
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter valid password", e.getMessage());
		}
	}
}