import java.sql.*;
import java.util.*;
class preparestatement
{
    public static void main(String args[])throws SQLException,ClassNotFoundException
	{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   
	   PreparedStatement pstmt=con.prepareStatement("insert into simran values(?,?,?)");
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter roll no :");
	   int rn=sc.nextInt();
	   System.out.println("Enter name :");
	   String nm=sc.next();
	   System.out.println("Enter marks:");
	   int mk=sc.nextInt();
	   
	   pstmt.setInt(1,rn);
	   pstmt.setString(2,nm);
	   pstmt.setInt(3,mk);
	   
	   int x=pstmt.executeUpdate();
	   System.out.println("prepareStatement data inserted succesfully"+x);
	   
	 
	   con.close();
	   
	}
}