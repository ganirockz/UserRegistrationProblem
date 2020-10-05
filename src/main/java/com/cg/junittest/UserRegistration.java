
package com.cg.junittest;

import java.util.regex.*;

public class UserRegistration {
	IuserRegistration registration = (detailsPattern,details)->{
		Pattern pattern = Pattern.compile(detailsPattern);
		Matcher matcher = pattern.matcher(details);
		return matcher.find();};
	public boolean validateFirstName(String firstName) throws ValidateFirstNameException{
		try {
		if(registration.validate("[A-Z]{1}[a-zA-Z]{2,}",firstName)) {
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
		if(registration.validate("[A-Z]{1}[a-zA-Z]{2,}",lastName )) {
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
		if(registration.validate("^([a][b][c])[.]([a-zA-Z]+)[@]([b][l][.][c][o])[.]([a-zA-Z]{2})$",email)) {
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
			if (registration.validate("[0-9]{2}[ ][0-9]{1}[0-9]{9}", phoneNumber)) {
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
			if (registration.validate("^[a-zA-Z]*@[^W][a-zA-Z0-9]*${8,}", password)) {
				return true;
			} else {
				throw new ValidatePasswordException("please enter valid password");
			}
		} catch (Exception e) {
			throw new ValidatePasswordException("please enter valid password");

		}

	}

}
