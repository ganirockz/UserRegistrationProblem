package com.cg.junittest;

import org.junit.*;


public class ValidateUserDetailsTest {
	@Test
	public void givenFirstName_whenMatches_ShouldReturnTrue() {
		try {
		ValidateUserDetails firstName = new ValidateUserDetails();
		Assert.assertTrue(firstName.validateFirstName("anesh"));
		}
		catch(ValidateFirstNameException e) {
			System.out.println(e.getMessage());
		}}

	@Test
	public void givenLastName_whenMatches_ShouldReturnTrue() {
		try {
		ValidateUserDetails lastName = new ValidateUserDetails();
		Assert.assertTrue(lastName.validateLastName("apeti"));
		}
		catch(ValidateLastNameException e) {
			System.out.println(e.getMessage());
		}}

	@Test
	public void givenEmail_whenMatches_ShouldReturnTrue() {
		try {
		ValidateUserDetails email = new ValidateUserDetails();
		Assert.assertTrue(email.validateEmail("xyz@bl.co.in"));
		}
		catch(ValidateEmailException e) {
			System.out.println(e.getMessage());
		}
		}

	@Test
	public void givenPhoneNumber_whenMatches_ShouldReturnTrue() {
		try {
		ValidateUserDetails phoneNumber = new ValidateUserDetails();
		Assert.assertTrue(phoneNumber.validatePhoneNumber("919866832489"));
		}
		catch(ValidatePhoneNumberException e) {
			System.out.println(e.getMessage());
		}}
	@Test
	public void givenPassword_whenMatches_ShouldReturnTrue() {
		try {
		ValidateUserDetails password = new ValidateUserDetails();
		Assert.assertTrue(password.validatePassword("Ganesh141324"));
		}
		catch(ValidatePasswordException e) {
			System.out.println(e.getMessage());
		}
		}
	
}
