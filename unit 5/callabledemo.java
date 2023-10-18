import java.sql.*;
import java.util.*;

class callabledemo
{
    public static void main(String args[])throws SQLException,ClassNotFoundException
	{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   
	   CallableStatement cstmt=con.prepareCall("{call InsertRowsimran(?,?,?)}");
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter roll no :");
	   int rn=sc.nextInt();
	   System.out.println("Enter name :");
	   String nm=sc.next();
	   System.out.println("Enter marks:");
	   int mk=sc.nextInt();
	   
	   cstmt.setInt(1,rn);
	   cstmt.setString(2,nm);
	   cstmt.setInt(3,mk);
	   int x=cstmt.executeUpdate();
	   System.out.println("number of rows inserted through procedure "+x);
	   con.close();
	   
	   
	}
}