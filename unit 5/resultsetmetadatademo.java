import java.sql.*;

class resultsetmetadatademo
{
    public static void main(String args[])throws SQLException,ClassNotFoundException
	{
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	   
	   Statement stmt=con.createStatement();
	   ResultSet rs=stmt.executeQuery("select * from simran");
	   ResultSetMetaData rsmd=rs.getMetaData();
	   System.out.println("no of column is :"+rsmd.getColumnCount());
	   System.out.println("name of first column is :"+rsmd.getColumnName(1));
	   System.out.println("first  column type :"+rsmd.getColumnTypeName(1));
	   System.out.println("table name  is :"+rsmd.getTableName(2));
	   
	   con.close();
	   
	   
	}
}