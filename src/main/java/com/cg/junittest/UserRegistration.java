package com.cg.junittest;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^([a][b][c])([_+-.]{0,1}([a-zA-Z0-9]+))*[@][a-z0-9]{1,}[.]([c][o][m]|[n][e][t])([.][a-zA-Z]{2,}){0,1}$");
		while (true) {
			System.out.println("Do you want to enter Email address: \nselect \n1.yes\n2.no");
			int option = Integer.parseInt(sc.nextLine());
			if(option == 1) {
			System.out.println("Enter the EMail address to check pattern :");
			String input = sc.nextLine();
			Matcher m = pattern.matcher(input);
			if (m.find()) {
				System.out.println("Valid");
			} else {
				System.out.println("Not Valid");
			}
			}
			else{
				System.out.println("Thank you!");
				break;
			}
		}
		sc.close();
	}

}
