package com.Bank_Info_Adding_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetData extends BankDATA_InterFace {

	public void GetData_DB() throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("To see All records here ");
		System.out.println("Enter User pin");
		int ID = scanner.nextInt();

		int userpass = 8386;

		if (ID == userpass) {
			System.out.println("Remember This is For Devloper ");
			System.out.println("Please enter second pin then you are eligible to see all data");

			int DbP = scanner.nextInt();
            int dbp = 1234;
			if (DbP == dbp) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (Exception e) {
					System.out.println("Driver Can not loadded !!!");
				}
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankinfo", "root", "root");
				System.out.println("|=|------Here is all data from data base-------|=|");

				PreparedStatement ps = con.prepareStatement("SELECT * FROM bank;");
				ResultSet rs = ps.executeQuery();
				// in this two keys we can created
				while (rs.next()) {
					String Id = rs.getString("Id");
					String name = rs.getString("Name");
					String Address = rs.getString("Address");
					String phoneN = rs.getString("PhoneN");
					String about = rs.getString("about");
					String PinCode = rs.getString("PinCode");
					System.out.println(Id + "       " + name + "       " + Address + "       " + phoneN + "       " + about + " " + PinCode);
				}
				con.close();
			} else {
				System.out.println("Warning invalide password !!!");
			}
		} else {
			System.out.println("Invalide pin !!!");
		}
	}

}
