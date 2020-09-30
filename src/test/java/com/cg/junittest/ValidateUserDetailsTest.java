package com.cg.junittest;

import org.junit.*;


public class ValidateUserDetailsTest {
	@Test
	public void givenFirstName_whenMatches_ShouldReturnTrue() {
		ValidateUserDetails firstName = new ValidateUserDetails();
		Assert.assertTrue(firstName.validateFirstName("Ganesh"));
	}

	@Test
	public void givenLastName_whenMatches_ShouldReturnTrue() {
		ValidateUserDetails lastName = new ValidateUserDetails();
		Assert.assertTrue(lastName.validateLastName("Rapeti"));
	}

	@Test
	public void givenEmail_whenMatches_ShouldReturnTrue() {
		ValidateUserDetails email = new ValidateUserDetails();
		Assert.assertTrue(email.validateEmail("abc.xyz@bl.co.in"));
	}

	@Test
	public void givenPhoneNumber_whenMatches_ShouldReturnTrue() {
		ValidateUserDetails phoneNumber = new ValidateUserDetails();
		Assert.assertTrue(phoneNumber.validatePhoneNumber("91 9866832489"));
	}

	public void givenPassword_whenMatches_ShouldReturnTrue() {
		ValidateUserDetails password = new ValidateUserDetails();
		Assert.assertTrue(password.validatePassword("@Ganesh141324"));
	}
	@Test
	public void givenMessage_whenNotSad_ShouldReturnHappy() {
		ValidateUserDetails moodAnalyser = new ValidateUserDetails();
		String mood = moodAnalyser.analyseMood("This is a Happy message");
		Assert.assertEquals("Happy", mood);
	}
}
