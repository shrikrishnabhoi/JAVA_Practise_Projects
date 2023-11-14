package com.Bank_Info_Adding_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DB_Connection extends GetData {
		
		public void DB_Add() throws Exception  {
			try {
		Class.forName("com.mysql.jdbc.Driver"); // here we can load Driver Class
			}
			catch(Exception e) {
				System.out.println("Driver class can not be Loaded !!!");
			}
		// data base connection statement
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankinfo", "root", "root"); 
		
		// ----------User Input----------
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("no need to add just click");
		String ID = scanner.nextLine();
		
		System.out.println("Enter Full Name ");
		String Name = scanner.nextLine();
		
		System.out.println("Enter Your Address ");
		String Address = scanner.nextLine();
		
		System.out.println("Enter User Phone Number ");
		String PhoneN = scanner.nextLine();
		
		System.out.println("Enter User PinCode ");
		String PinCode = scanner.nextLine();
		
		String About = null;
		
		System.out.println("Enter want to do \n 1] Make A Deposit Or Withdrawal \n 2] Open An Account \n 3] Pay Bills \n 4] Deposit Or Cash A Check \n 5] Take Out A Loan \n 6] Apply For A Credit Card");
		
		System.out.println(" Enter Above Number ");
		int num = scanner.nextInt();
			if(num == 1) {
				 
				 String hello = "Make A Deposit Or Withdrawal";
				 About = hello;
		     }
			else if(num == 2) {
				    String hello2 = "Open An Account";
					About = hello2;
			} 
			else if(num == 3) {
				
				String hello3 = "Pay Bills";
				About = hello3;
			}
				
			else if(num == 4) {
					
					String hello4 = "Deposit Or Cash A Check";
					About = hello4;
			}
					
			else if(num == 5) {
						
						String hello5 = "Take Out A Loan";
						About = hello5;		
		} 
			else if(num == 6) {
				
				String hello6 = "Apply For A Credit Card";
				About = hello6;		
} 
			
			else {
				System.out.println("wrong number");
		}
		
//		System.out.println(" Enter your Gender-[ Male / Email / Other ]-");
//		String gender = scanner.nextLine();
//		System.out.println(" Enter your City Name");
//		String city = scanner.nextLine();
		PreparedStatement ps = con.prepareStatement("insert into bank values(?,?,?,?,?,?)"); 
		// here we can provide addition parameter
		
		ps.setString(1, ID);
		ps.setString(2, Name);
		ps.setString(3, Address);
		ps.setString(4, PhoneN);
		ps.setString(5, About); // here we have give parameter value
		ps.setString(6, PinCode);
		
		System.out.println("You selected :- " + About);
		int i = ps.executeUpdate(); // check condition if is success than print massage
 
		if (i > 0) {
			System.out.println(" Values adding Successfully.");
			System.out.println(" ============ Thank You ============ ");
		} else {
			System.out.println("Faild !!!");
		}
		con.close();
		}
	}


