package com.cg.junittest;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to User Registration system");
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{2,}");
		String firstName,lastName;
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
		sc.close();
	}

}
