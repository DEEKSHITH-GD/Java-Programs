package com.destinationTech.BankingApplication.package1;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome to the Banking Application");
		Scanner sc = new Scanner(System.in);
		BankingApp ba = new BankingApp();//load the driver and establish the connection
		System.out.println("1. Register\n"
				+ "2. User Login\n"
				+ "3. Admin Login\n"
				+ "4. Quit\n");
		System.out.println("Please enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Registration In progress");
			BankingApp b = new BankingApp();
			boolean r = b.register();
			if(r==true) {
				System.out.println("Registration Successful");
			}else {
				System.out.println("Registration Failed");
			}
		}
		case 2: {
			System.out.println("Login In progress");
			BankingApp b = new BankingApp();
			b.login();
		}
		case 3: {
			Admin a = new Admin();
			System.out.println("\n\t\tAdmin Login");
			System.out.println("Enter the Admin ID: ");
			a.setAdmin_id(sc.next());
			System.out.println("Enter the Admin Password: ");
			a.setAdmin_pwd(sc.next());
			
			boolean b = a.validate();
			if(b==true) {
				System.out.println("Admin Login Successful");
			}else {
				System.out.println("Admin Login Failed");
			}
		}
		case 4: {
			System.out.println("Logout In progress");
		}
		default:
			
		}
	}
}
