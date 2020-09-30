package com.cg.junittest;

import java.util.regex.*;

public class ValidateUserDetails {
	public boolean validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		return matcher.find();
	}

	public boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(lastName);
		return matcher.find();
	}

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("^([a][b][c])[.]([a-zA-Z]+)[@]([b][l][.][c][o])[.]([a-zA-Z]{2})$");
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	public boolean validatePhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile("[0-9]{2}[ ][0-9]{1}[0-9]{9}");
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.find();
	}

	public boolean validatePassword(String password) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]*@[^W][a-zA-Z0-9]*${8,}");
		Matcher matcher = pattern.matcher(password);
		return matcher.find();
	}

	public String analyseMood(String message) {

		if (message.contains("Happy")) {
			System.out.println("user registerd successfully");
			return "Happy";}
		else {
			System.out.println("user not registered");
			return "SAD";
		}
	}
}
