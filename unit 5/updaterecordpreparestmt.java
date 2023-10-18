import java.sql.*;
import java.util.*;
class updaterecordpreparestmt
{
    public static void main(String args[])throws SQLException,ClassNotFoundException
	{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   
	   PreparedStatement pstmt=con.prepareStatement("update simran set marks=? where rollno=?");
	   
	        
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter roll no  :");
	   int rn=sc.nextInt();
	   
	   System.out.println("Enter marks for update:");
	   int mk=sc.nextInt();
	   
	   pstmt.setInt(2,rn);
	   pstmt.setInt(1,mk);
	   
	  int x=pstmt.executeUpdate();
	   System.out.println("marks  updated succesfully"+x);
	   
	 
	   con.close();
	   
	}
}