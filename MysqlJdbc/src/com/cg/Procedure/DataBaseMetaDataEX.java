package com.cg.Procedure;

import java.sql.*;

public class DataBaseMetaDataEX {

	public static void main(String[] args) throws SQLException {
		
		
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","deepU.13");
			System.out.println("Connection...Succeded");
			Statement stmt= mycon.createStatement();
			System.out.println("UR Statement has been created");
			
			DatabaseMetaData dbmd =mycon.getMetaData();
	        //ResultSetMetaData rsmd = mycon.getMetaData();
	        
	        System.out.println("DB name:"+dbmd.getDatabaseProductName());
	        System.out.println("DB version "+dbmd.getDatabaseProductVersion());
	        System.out.println("DB Driver name "+dbmd.getDriverName());
	        System.out.println("Driver Version "+dbmd.getDriverVersion());
	        System.out.println("--------------Tables-------------");
	        String t[] = {"TABLE"};
	       
	        ResultSet rs=dbmd.getTables(null, null, null, t);
	        
	        while(rs.next())
	        {
	            System.out.println(rs.getString("TABLE_NAME"));
	        }
	    }

	 

	}
	 
			
			