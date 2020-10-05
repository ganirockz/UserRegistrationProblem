
package com.cg.junittest;

import org.junit.*;


public class UserRegistrationTest {
	@Test
	public void givenFirstName_whenMatches_ShouldReturnTrue() {
		try {
			UserRegistration firstName = new UserRegistration();
		Assert.assertTrue(firstName.validateFirstName("Ganesh"));
		}
		catch(ValidateFirstNameException e) {
			System.out.println(e.getMessage());
		}}

	@Test
	public void givenLastName_whenMatches_ShouldReturnTrue() {
		try {
			UserRegistration lastName = new UserRegistration();
		Assert.assertTrue(lastName.validateLastName("Rapeti"));
		}
		catch(ValidateLastNameException e) {
			System.out.println(e.getMessage());
		}}

	@Test
	public void givenEmail_whenMatches_ShouldReturnTrue() {
		try {
			UserRegistration email = new UserRegistration();
		Assert.assertTrue(email.validateEmail("xyz@bl.co.in"));
		}
		catch(ValidateEmailException e) {
			System.out.println(e.getMessage());
		}
		}

	@Test
	public void givenPhoneNumber_whenMatches_ShouldReturnTrue() {
		try {
			UserRegistration phoneNumber = new UserRegistration();
		Assert.assertTrue(phoneNumber.validatePhoneNumber("91 9866832489"));
		}
		catch(ValidatePhoneNumberException e) {
			System.out.println(e.getMessage());
		}}
	@Test
	public void givenPassword_whenMatches_ShouldReturnTrue() {
		try {
			UserRegistration password = new UserRegistration();
		Assert.assertTrue(password.validatePassword("@Ganesh141324"));
		}
		catch(ValidatePasswordException e) {
			System.out.println(e.getMessage());
		}
		}
	
}
