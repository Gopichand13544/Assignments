package com.cg.Procedure;
import java.sql.*;
public class Batch {
	 



	    public static void main(String[]args) throws SQLException
	{
	        Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","deepU.13");
	        Statement stmt=myConn.createStatement();
	        myConn.setAutoCommit(false);
	        String sql="INSERT INTO BOOKS(tno,name,author)" + "VALUES(11,'ADDD','SAR')";
	        stmt.addBatch(sql);
	        String sql1="INSERT INTO BOOKS(tno,name,author)" + "VALUES(112,'ADDDY','SARO')";
	        stmt.addBatch(sql1);
	        int[]count=stmt.executeBatch();
	        myConn.commit();
	        System.out.println("the count is"+count);
	        
	        
	        
	        
	}
	}