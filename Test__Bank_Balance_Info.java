package com.Test_BankInfo;

import com.Bank_Info_Adding_Project.DBC_DataRetrive;

//import com.DBConnectore.DBC_DataRetrive;

public class Test__Bank_Balance_Info {
	public static void main(String[] args) throws Exception{
		
		
		DBC_DataRetrive dd = new DBC_DataRetrive();
		dd.Displaymassage();
		System.out.println("================================================");
		dd.DB_Add();
		System.out.println("================================================");
		dd.GetData_DB(); 
		
	}

}
