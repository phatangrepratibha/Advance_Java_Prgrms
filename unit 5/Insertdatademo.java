import java.sql.*;
class Insertdatademo
{
   public static void main(String args[])throws SQLException,ClassNotFoundException
   {
       
	       Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		   Statement stmt=con.createStatement();
		   
		   
		   int x=stmt.executeUpdate("insert into student values(45,'rohit',55)");
		   System.out.println("record inserted successfully"+x);
		   
		  con.close();
 
	   
   }
}