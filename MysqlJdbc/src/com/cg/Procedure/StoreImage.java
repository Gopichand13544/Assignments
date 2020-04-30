package com.cg.Procedure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
public class StoreImage {

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","deepU.13");
        
	       String query = "INSERT INTO mytable(col2) VALUES (?)";
	       PreparedStatement pstmt = con.prepareStatement(query);
	       
	       File image = new File("C:\\Users\\radha\\OneDrive\\Desktop\\Keethu\\K'Sql\\msd.jpg");
	       FileInputStream inputStream = new FileInputStream(image);
	       
	       pstmt.setBinaryStream(1, inputStream);
	       pstmt.executeUpdate();
	       System.out.println("Image also inserted...");

	}

}
