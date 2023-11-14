package com.Bank_Info_Adding_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBC_DataRetrive extends DB_Connection {

	public void DBretrive() throws Exception {
		
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println("Error Driver Loading unsuccsesfull !!!!");
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankinfo", "root", "root");
		PreparedStatement ps = con.prepareStatement("SELECT * FROM bank ORDER BY id DESC LIMIT 1;");
		ResultSet rs = ps.executeQuery();
		// in this two keys we can created
		while(rs.next()) {
		String id = rs.getString("id");
		String name = rs.getString("Name");
		String Password = rs.getString("Password");
		String Date = rs.getString("Time_date");
		String PinCode = rs.getString("PinCode");
		
		System.out.println("This user add data from last Time");
		System.out.println();
		System.out.println( id +" Name = "+name + " " + Password + " " + Date + " " + PinCode);
		}
		con.close();
}

}
