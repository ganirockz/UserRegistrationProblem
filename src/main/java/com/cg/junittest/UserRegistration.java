
package com.cg.junittest;

import java.util.regex.*;

public class UserRegistration {
	public boolean validateFirstName(String firstName) throws ValidateFirstNameException{
		try {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.find()) {
			return true;}
		else {
			throw new ValidateFirstNameException("please enter a valid first name");
		}
		}
		catch(Exception e) {
			throw new ValidateFirstNameException("please enter a valid first name");	
		}
	}

	public boolean validateLastName(String lastName) throws ValidateLastNameException{
		try {
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		Matcher matcher = pattern.matcher(lastName);
		if(matcher.find()) {
			return true;}
		else {
			throw new ValidateLastNameException("please enter a valid last name");
		}
		}catch(Exception e) {
			throw new ValidateLastNameException("please enter a valid last name");	
		}
	}

	public boolean validateEmail(String email) throws ValidateEmailException{
		try {
		Pattern pattern = Pattern.compile("^([a][b][c])[.]([a-zA-Z]+)[@]([b][l][.][c][o])[.]([a-zA-Z]{2})$");
		Matcher matcher = pattern.matcher(email);
		if(matcher.find()) {
			return true;}
		else {
			throw new ValidateEmailException("please enter a valid email address");
		}
		}
		catch(ValidateEmailException e) {
			throw new ValidateEmailException("please enter a valid email adddress");	
		}
	}

	public boolean validatePhoneNumber(String phoneNumber) throws ValidatePhoneNumberException{
		try {
			Pattern pattern = Pattern.compile("[0-9]{2}[ ][0-9]{1}[0-9]{9}");
			Matcher matcher = pattern.matcher(phoneNumber);
			if (matcher.find()) {
				return true;
			} else {
				throw new ValidatePhoneNumberException("please enter a valid phone number");
			}
		} catch (Exception e) {
			throw new ValidatePhoneNumberException("please enter a valid phone number");
		}
	}

	public boolean validatePassword(String password) throws ValidatePasswordException {
		try {
			Pattern pattern = Pattern.compile("^[a-zA-Z]*@[^W][a-zA-Z0-9]*${8,}");
			Matcher matcher = pattern.matcher(password);
			if (matcher.find()) {
				return true;
			} else {
				throw new ValidatePasswordException("please enter valid password");
			}
		} catch (Exception e) {
			throw new ValidatePasswordException("please enter valid password");

		}

	}

}
