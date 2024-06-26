package com.greatlearning.javafsd.emailapp.service;

import java.util.Scanner;

import com.greatlearning.javafsd.emailapp.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
		System.out.println("Please enter your full name: ");
		System.out.println("First Name: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		System.out.println("Last Name: ");

		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName, lastName);
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();

		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}

		else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else
			System.out.println("Enter a valid option");
		
		sc.close();
	}
}
