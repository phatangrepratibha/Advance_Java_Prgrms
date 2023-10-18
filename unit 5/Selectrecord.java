import java.sql.*;
class Selectrecord
{
   public static void main(String args[])throws SQLException,ClassNotFoundException
   {
       
	       Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		   Statement stmt=con.createStatement();
		   System.out.println("connection successful");
		   
		   ResultSet rs=stmt.executeQuery("select * from student");
		   
		   System.out.println("**VJTech Student Records***");
  
 
        System.out.println("RollNo\tName\tMarks");
  
 
        System.out.println("=========================");
 
		   
		  
        while(rs.next())
        {
 
          System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
 
        }
 
	   
   }
}