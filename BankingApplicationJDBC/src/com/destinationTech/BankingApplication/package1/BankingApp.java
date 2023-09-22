package com.destinationTech.BankingApplication.package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BankingApp{
	public static Connection con;	
	String custId; 		
	String custName;		
	int accno;	
	String password; 		
	int balance;		
	String bankName;		
	String ifscCode;		
	String email;
	private PreparedStatement pstmt;
	private Statement stmt;
	
	public BankingApp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/dest_project","root","Deekshith_31");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean register() {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the customer ID:");
			custId=sc.next();
			System.out.println("Enter the customer Name:");
			custName=sc.next();
			System.out.println("Enter the Account no:");
			accno=sc.nextInt();
			System.out.println("Enter the Password:");
			password=sc.next();
			System.out.println("Enter the amount being deposited:");
			balance=sc.nextInt();
			System.out.println("Enter the Bank Name:");
			bankName=sc.next();
			System.out.println("Enter the IFSC Code:");
			ifscCode=sc.next();
			System.out.println("Enter the email:");
			email=sc.next();
			
			String query = "insert into bankingapp(custId,custName,accno,password,balance,bankName,ifscCode,email)"
					+ "values(?,?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,custId);
			pstmt.setString(2,custName);
			pstmt.setInt(3,accno); 
			pstmt.setString(4,password);
			pstmt.setInt(5,balance);
			pstmt.setString(6,bankName);
			pstmt.setString(7,ifscCode);
			pstmt.setString(8,email);
			
			int x = pstmt.executeUpdate();
			if(x>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public void login() {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the customer Name:");
			String custName = sc.next();
			System.out.println("Enter the Password:");
			String password = sc.next();
			String query = "select status from bankingapp where custName=? and password=?" ; 
			pstmt =con.prepareStatement(query);
			pstmt.setString(1,custName);
			pstmt.setString(2,password);
			ResultSet x = pstmt.executeQuery();
			if(x.next() == true) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Login Failed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}