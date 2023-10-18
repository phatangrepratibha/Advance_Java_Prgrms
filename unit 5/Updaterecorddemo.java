import java.sql.*;
class Updaterecorddemo
{
   public static void main(String args[])throws SQLException,ClassNotFoundException
   {
       
	       Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		   Statement stmt=con.createStatement();
		   
		   
		   int x=stmt.executeUpdate("update student set STUD_ROLL=17 where STUD_ID=30");
		   System.out.println("one row updated successfully"+x);
		   
		  con.close();
 
	   
   }
}