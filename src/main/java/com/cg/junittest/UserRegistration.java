package com.cg.junittest;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration system");
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		String firstName,lastName,Email,phoneNumber,password;
		while (true) {
			System.out.println("Enter the first name of user: ");
			firstName = sc.nextLine();
			Matcher m = pattern.matcher(firstName);
			if(m.find()) {
				System.out.println("User first name added successfully");
				break;
			}
			else {
				System.out.println("Please enter the valid first name");
			}
		}
		while (true) {
			System.out.println("Enter the last name of user: ");
			lastName = sc.nextLine();
			Matcher m = pattern.matcher(lastName);
			if(m.find()) {
				System.out.println("User last name added successfully");
				break;
			}
			else {
				System.out.println("Please enter the valid last name");
			}
		}
		Pattern p = Pattern.compile("^([a][b][c])[.]([a-zA-Z]+)[@]([b][l][.][c][o])[.]([a-zA-Z]{2})$");
		while (true) {
			System.out.println("Enter the Email of user: ");
			Email = sc.nextLine();
			Matcher m = p.matcher(Email);
			if(m.find()) {
				System.out.println("User Email added successfully");
				break;
			}
			else {
				System.out.println("Please enter the valid Email");
			}
		}
		Pattern mobilePattern = Pattern.compile("[0-9]{2}[ ][1-9]{1}[0-9]{9}");
		while (true) {
			System.out.println("Enter the phone number of user: ");
			phoneNumber = sc.nextLine();
			Matcher m = mobilePattern.matcher(phoneNumber);
			if(m.find()) {
				System.out.println("User phone number added successfully");
				break;
			}
			else {
				System.out.println("Please enter the valid phone number");
			}
		}
		Pattern passwordPattern = Pattern.compile("^[a-zA-Z]*[0-9]+[a-zA-Z0-9]*${8,}");
		while (true) {
			System.out.println("Enter the password of user: ");
			password = sc.nextLine();
			Matcher m = passwordPattern.matcher(password);
			if (m.find()) {
				System.out.println("User password added successfully");
				break;
			} else {
				System.out.println("Please enter the valid password");
			}
		}
		sc.close();
	}

}
