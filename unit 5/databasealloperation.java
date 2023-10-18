import java.sql.*;
import java.util.*;

class databasealloperation
{
    public static void main(String args[])throws SQLException,ClassNotFoundException
	{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   
	  Scanner sc=new Scanner(System.in);
	  int id,mk,ch;
	  String nm;
	  do
	  {
		  System.out.println("***database operations***");
		  System.out.println("1.Create table ");
		  System.out.println("2.Insert row ");
		  System.out.println("3.Update row ");
		  System.out.println("4.Delete row ");
		  System.out.println("5.fetch data ");
		  System.out.println("6.exit");
		  System.out.println("Enter ur choice ");
		   ch=sc.nextInt();
		  switch(ch)
		  {
			  case 1:Statement stmt=con.createStatement();
			  stmt.execute("create table studentm(id number(3),name varchar(10),marks number(3) )");
			  System.out.println("Table created successfully");
			  break;
			  
			  case 2:PreparedStatement pstmt=con.prepareStatement("insert into studentm values(?,?,?)");
			  System.out.println("Enter student id :");
			  id=sc.nextInt();
			  System.out.println("Enter student name :");
			  nm=sc.next();
			  System.out.println("Enter student marks :");
			  mk=sc.nextInt();
			  pstmt.setInt(1,id);
			  pstmt.setString(2,nm);
			  pstmt.setInt(3,mk);
			  pstmt.executeUpdate();
			  System.out.println("row inserted :");			  
			  break;
			  
			  case 3:PreparedStatement pstmt1=con.prepareStatement("update studentm set marks=? where id=?");
			  System.out.println("Enter student id for update :");
			  id=sc.nextInt();
			  System.out.println("Enter new student marks :");
			  mk=sc.nextInt();
			  pstmt1.setInt(2,id);
			  pstmt1.setInt(1,mk);
			  pstmt1.executeUpdate();
			  System.out.println("row updated:");			  
			  break;
			  
			  case 4:PreparedStatement pstmt2=con.prepareStatement("delete from studentm where id=?");
			  System.out.println("Enter id for delete :");
			  id=sc.nextInt();			  
			  pstmt2.setInt(1,id);			 
			  pstmt2.executeUpdate();
			  System.out.println("row deleted :");
			  break;
			  
			  case 5:Statement stmt1=con.createStatement();
			  ResultSet rs=stmt1.executeQuery("select * from studentm");
			  System.out.println("***Student management system***");
			  System.out.println("id\tname\tmarks");
			  System.out.println("====================");
			  while(rs.next())
			  {
				  System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			  }
			  
			  break;
			  
			  case 6:System.out.println("thanks for using our software");
			  break;
			  
			default:System.out.println("invalid choice");
		  }
		  
	  }while(ch!=6);
	  
	   
	  
	   
	   con.close();
	   
	   
	}
}