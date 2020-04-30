package com.cg.mysqljdbc;

import java.sql.*;

public class JdbcDriver {

    public static void main(String[] args) {
        
        
        try {
            //get connection to the database
            Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","deepU.13");
            //create a statement
            Statement stmt= mycon.createStatement();
            //Execute sql query
            String sql="insert into books(tno,name,author) values(1,'java','sri')";
            String sql1="insert into books(tno,name,author) values(2,'devops','david')";
            String sql2="insert into books(tno,name,author) values(3,'jdbc','vidya')";
            String sql3="insert into books(tno,name,author) values(4,'capg','pgc')";
             stmt.executeUpdate(sql);
             stmt.executeUpdate(sql1);
             stmt.executeUpdate(sql2);
             stmt.executeUpdate(sql3);           
            //Process the resultset
            ResultSet rs=stmt.executeQuery("select * from books");
            while(rs.next())
            {
                System.out.println(rs.getString("name")+" "+rs.getString("author"));
               
                
            }
            System.out.println("----------------data inserted");
            
            String sql4="delete from books where tno=4";
            stmt.executeUpdate(sql4);
            ResultSet rs1=stmt.executeQuery("select * from books");
            while(rs1.next())
            {
                System.out.println(rs1.getString("name")+" "+rs1.getString("author"));
                
                
            }
            System.out.println("======data deleted");
            
            String sql5="update books set author='srividhya' where tno=1";
            stmt.executeUpdate(sql5);
            ResultSet rs2=stmt.executeQuery("select * from books");
            while(rs2.next())
            {
                System.out.println(rs2.getString("name")+" "+rs2.getString("author"));
                
            }        
             System.out.println("-------------data updated"); 
             
             String s3="insert into books(tno,name,author) values(4,'capg','pgc')";
             stmt.executeUpdate(s3);
             ResultSet rs11=stmt.executeQuery("select * from books");
             while(rs11.next())
             {
                 System.out.println(rs11.getString("name")+" "+rs11.getString("author"));
                
                 
             }
             System.out.println("---------new column inserted");
        
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

 

    }

 

}
 