import java.sql.*;
import java.util.*;
class Deleterecordpreparestmt
{
   public static void main(String args[])throws SQLException,ClassNotFoundException
   {
       
	       Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		   PreparedStatement pstmt=con.prepareStatement("delete from simran where rollno=?");
		   
		     
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter roll no for deletion :");
	   int rn=sc.nextInt();
	   
	   pstmt.setInt(1,rn);
		   
		   int x=pstmt.executeUpdate();
		   System.out.println("one row is deleted successfully"+x);
		   
		  con.close();
 
	   
   }
}