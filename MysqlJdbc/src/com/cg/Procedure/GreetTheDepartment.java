package com.cg.Procedure;
import java.sql.*;
public class GreetTheDepartment {

	public static void main(String[] args) {
		
		Connection mycon= null;
		CallableStatement mystmt= null;
		
		try {
			//get connection
			Connection myCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","deepU.13");
			
			String theDepatment= "Engineering";
			//prepare the stored procedurecall
			mystmt=mycon.prepareCall("{call greet_the_department(?)}");
			//set the parameters
			mystmt.registerOutParameter();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
