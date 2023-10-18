import java.net.*;
import java.util.*;
import java.io.*;
class server1
{
 public static  void main(String args[])throws IOException
 {
     ServerSocket ss=new ServerSocket(8080);
	 Socket s2=ss.accept();
	 
	    Scanner sc=new Scanner(System.in);
		DataInputStream din=new DataInputStream(s2.getInputStream());
        DataOutputStream dout=new DataOutputStream(s2.getOutputStream());
		String str="";
        while(!str.equals("bye"))
         {
	        str=din.readUTF();
			System.out.println("client says :"+str);
			str=sc.nextLine();
			dout.writeUTF(str);
	   
         }
		 s2.close();
	 
 }
}