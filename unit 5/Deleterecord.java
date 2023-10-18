import java.sql.*;
class Deleterecord
{
   public static void main(String args[])throws SQLException,ClassNotFoundException
   {
       
	       Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		   Statement stmt=con.createStatement();
		   
		   
		   int x=stmt.executeUpdate("delete from student where STUD_ID=7");
		   System.out.println("one row is deleted successfully"+x);
		   
		  con.close();
 
	   
   }
}