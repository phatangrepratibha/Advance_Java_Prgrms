import java.net.*;
import java.util.*;
import java.io.*;
class client1
{
 public static  void main(String args[])throws IOException
 {
   Socket s1=new Socket("localhost",8080);
   
   Scanner sc=new Scanner(System.in);
   DataInputStream din=new DataInputStream(s1.getInputStream());
   DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
   String str="";
   while(!str.equals("bye"))
   {
	   str=sc.nextLine();
	   dout.writeUTF(str);
	   str=din.readUTF();
	   System.out.println("srever says :"+str);
	   
   }
   s1.close();
   
   
 }
}