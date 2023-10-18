import java.sql.*;
class TableCreate
{
    public static void main(String args[])throws SQLException,ClassNotFoundException
	{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   
	   Statement stmt=con.createStatement();
	   
	   
	  int x=stmt.executeUpdate("create table simran(rollno number(3),name varchar(10),marks number(3))");
	   System.out.println("table created succesfully"+x);
	   
	 
	   con.close();
	   
	}
}